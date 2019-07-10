package com.sking.controller;

import com.sking.service.BaseModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/modules")
public class BaseModulesController {
    private String path = "system/menu";
    @Autowired
    BaseModulesService modulesService;
}
