package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Lqh
 * @time: 2019/7/23 12:07
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String printHello(Model model){
        model.addAttribute("message", "this is springmvc");
        return "hello";
    }
}
