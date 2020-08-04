package com.qf.Controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testString")
    public String testString(Model model){

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"jack"));
        users.add(new User(2,"rose"));
        users.add(new User(3,"tom"));
        model.addAttribute("users",users);
        return "list.jsp";
    }
    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"jack"));
        users.add(new User(2,"rose"));
        users.add(new User(3,"tom"));
        request.setAttribute("users",users);
        request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request,response);
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(Model model){

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"jack"));
        users.add(new User(2,"rose"));
        users.add(new User(3,"tom"));
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("list.jsp");
        return modelAndView;
    }
    @RequestMapping("testForwardAndRedirect")
    public String testForwardAndRedirect(){
        //return "forward:/index.jsp";
        return "redirect:/index.jsp";

    }
    @RequestMapping("testAjax")
    @ResponseBody
    public String testAjax(User user){

        System.out.println(user);

        return "success";
    }
    @RequestMapping("testPost")
    @ResponseBody
    public User testPost(User user){

        System.out.println(user);
        user.setId(1001);
        user.setName("张艺兴");
        return user;
    }
    @PostMapping ("testGet")
    @ResponseBody
    public User testGet(User user){
        System.out.println(user);
        user.setId(1001);
        user.setName("李四");
        return user;
    }
}
