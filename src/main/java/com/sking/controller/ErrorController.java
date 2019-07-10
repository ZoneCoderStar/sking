package com.sking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
//@Controller
//@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/403")
    public String err403(){
        return "/error/403";
    }

    @RequestMapping("/404")
    public String err404(){
        return "/error/404";
    }

    @RequestMapping("/500")
    public String err500(){
        return "/error/500";
    }
}
