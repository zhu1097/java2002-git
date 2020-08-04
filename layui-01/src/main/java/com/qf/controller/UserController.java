package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile photo)throws Exception{
        //上传路径
        String path = "D:\\server\\apache-tomcat-8.5.31\\webapps\\upload\\";
        //获取文件名称
        String filename = photo.getOriginalFilename();
        System.out.println(filename);

        //使用UUID重命名
//        String uuid = UUID.randomUUID().toString().replace("-", "");
//        filename+=uuid;

        File file = new File(path,filename);

        photo.transferTo(file);

        return "{\n" +
                "  \"code\": 0\n" +
                "  ,\"msg\": \"\"\n" +
                "  ,\"data\": {\n" +
                "    \"src\": \"http://cdn.layui.com/123.jpg\"\n" +
                "  }\n" +
                "} ";
    }
}
