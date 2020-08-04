package com.qf.Controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(Model model){
        System.out.println("testModelAndView");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"jack",new Date()));
        users.add(new User(2,"rose",new Date()));
        users.add(new User(3,"tom",new Date()));
        return users;
    }
    @RequestMapping("upload")
    public String upload(Model model,MultipartFile photo) throws Exception{
        String path ="E:\\apache-tomcat-8.5.31\\webapps\\upload\\";
        String fileName =photo.getOriginalFilename();
        System.out.println(fileName);
        model.addAttribute("fileName",fileName);
        File file = new File(path, fileName);
        photo.transferTo(file);
        return "success.jsp";
    }
    @RequestMapping("test_exception")
    public void test_exception() throws Exception{
        int i= 1 / 0;
        //throw new Exception("自定义异常");
    }
    @RequestMapping("test_interceptor")
    public String test_interceptor() {
        System.out.println("testInterceptor执行了...");
        return "success.jsp";
    }

}
