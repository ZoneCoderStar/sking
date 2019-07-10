package com.sking.controller;

import com.sking.service.BaseRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class BaseRolesController {
    private String path = "system/role";
    @Autowired
    BaseRolesService rolesService;
}
