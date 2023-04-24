package com.ll.app20230424.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello World";
    }
}
