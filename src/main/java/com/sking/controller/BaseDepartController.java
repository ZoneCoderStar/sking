package com.sking.controller;

import com.sking.service.BaseDepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/depart")
public class BaseDepartController {
    private String path = "system/dept";
    @Autowired
    BaseDepartService departService;
}
