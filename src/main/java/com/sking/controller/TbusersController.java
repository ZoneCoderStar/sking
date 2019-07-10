package com.sking.controller;

import com.sking.entity.Tbusers;
import com.sking.service.TbusersService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("tbusers")
public class TbusersController {
    @Resource
    TbusersService tbusersService;

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insertTbuser(Tbusers tbusers){
        return tbusersService.insertUser(tbusers);
    }

    @RequiresPermissions("user:用户管理")
    @RequestMapping(value = "/commonSelectTbusersList")
    @ResponseBody
    public String commonSelectTbusersList(Tbusers tbusers){
        return tbusersService.queryTbusers(tbusers);
    }

    @RequestMapping(value = "/selectTbusersList")
    @ResponseBody
    public String selectTbusersList(Tbusers tbusers){
        return tbusersService.queryTbusers(tbusers);
    }

}
