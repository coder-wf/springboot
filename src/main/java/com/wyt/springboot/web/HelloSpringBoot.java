package com.wyt.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String Hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        /*if(true){
            throw new Exception("人为异常");
        }*/
        return "hello";
    }
}
