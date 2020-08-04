package com.qf.controller;
import com.qf.pojo.Admin;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("loginUser")
    public String loginUser(User user, HttpServletRequest request){
        user = userService.selectAdminByUsernameAndPassword(user);
        System.out.println(user);
       if (user!=null){
           HttpSession session = request.getSession();
           session.setAttribute("userAccount",user.getEmail());
           return "success";
       }else {
           return "failed";
       }
    }
    @RequestMapping("showMyProfile")
    public ModelAndView showMyProfile(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        System.out.println( "session.getAttribute"+session.getAttribute("userAccount"));
        User user = userService.selectUserByEmail((String) session.getAttribute("userAccount"));
        session.setAttribute("user",user);
        modelAndView.setViewName("/before/my_profile");
        return modelAndView;
    }
    @RequestMapping("changeProfile")
    public ModelAndView changeProfile(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/before/change_profile");
        return modelAndView;
    }
    @RequestMapping("updateUser")
    public ModelAndView updateUser(User user,String address, HttpServletRequest request)  {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        User user1 = (User) session.getAttribute("user");
        user1.setNickName(user.getNickName());
        user1.setSex(user.getSex());
        user1.setBirthday(user.getBirthday());
        user1.setAddress(user.getAddress());
        System.out.println("address"+address);
        System.out.println("user.getAddress():"+ user.getAddress());
        userService.updateUser(user1);
//        modelAndView.setViewName("/before/my_profile");
        modelAndView.setViewName("redirect:/user/showMyProfile");
        // redirect:
        // forward:
//        return "redirect:/user/showMyProfile";
      return modelAndView;
    }
    @RequestMapping("changeAvatar")
    public ModelAndView changeAvatar(User user,String address, HttpServletRequest request)  {
        ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("/before/change_avatar");
      return modelAndView;
    }
    @RequestMapping("upLoadImage")
    public ModelAndView upLoadImage(User user,String address, HttpServletRequest request)  {
        ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("redirect:/user/showMyProfile");
      return modelAndView;
    }
    @RequestMapping("passwordSafe")
    public ModelAndView passwordSafe(User user,String address, HttpServletRequest request)  {
        ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("/before/password_safe");
      return modelAndView;
    }
    @RequestMapping("validatePassword")
    public String validatePassword(String password, HttpServletRequest request) {
        System.out.println("password:"+password);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (password.equals(user.getPassword())) {
            return "success";
        }
        return "failed";
    }

    @RequestMapping("/loginOut2")
    public ModelAndView loginOut2(HttpServletRequest request) {
        System.out.println("/loginOut2");
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.removeAttribute("userAccount");
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @RequestMapping("loginOut")
    public ModelAndView loginOut(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("loginOut");
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.removeAttribute("userAccount");
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @RequestMapping("/forgetPassword")
    public ModelAndView forgetPassword() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "/before/forget_password");
        return modelAndView;
    }
    @RequestMapping("/validateEmail")
    public String validateEmail(String email) {
        User user = userService.selectUserByEmail(email);
        if (null == user) {
            return "success";
        }
        return "hasUser";
    }
    @RequestMapping("/sendEmail")
    public String sendEmail(String email, HttpServletRequest request) {
        //验证用户是否存在
        if ("success".equals(validateEmail(email))) {
            return "hasNoUser";
        }

        String code = com.qf.videos.utils.MailUtils.getValidateCode(6);
        boolean flag = com.qf.videos.utils.MailUtils.sendMail(email, "测试邮件随机生成的验证码是：" + code, "你好，这是一封测试邮件，无需回复。");
        if (flag) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("code", code);
            return "success";
        }
        return "failed";
    }

    @RequestMapping("/validateEmailCode")
    public String validateEmailCode(String email, String code, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String sessionEmail = (String) session.getAttribute("email");
        String sessionCode = (String) session.getAttribute("code");
        if (sessionEmail.equals(email) && sessionCode.equals(code)) {
            return "/before/reset_password";
        }
        return "redirect:/user/forgetPassword";
    }
    @RequestMapping("/insertUser")
    public String insertUser(User user, HttpServletRequest request) {
        user.setCreateTime(new Date());
        if (userService.insertUser(user)) {
            HttpSession session = request.getSession();
            session.setAttribute("userAccount", user.getEmail());
            return "success";
        }
        throw new RuntimeException("用户注册失败");
    }
}
