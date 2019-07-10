package com.sking.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseUsers;
import com.sking.service.BaseUsersService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system/user")
public class BaseUsersController {
    private String path = "system/user";
    @Autowired
    BaseUsersService usersService;

    @RequiresPermissions("system:user")
    @GetMapping()
    public String user()
    {
        return path + "/user";
    }

    @GetMapping("/userTestPage")
    public String userTestPage()
    {
        return path + "/user_test";
    }

    @PostMapping("/list")
    @ResponseBody
    public String list(BaseUsers user,Integer pageNum,Integer pageSize){
        PageInfo<BaseUsers> list = usersService.selectBaseUsers(user,pageNum,pageSize);
        return JSON.toJSONString(list);
    }

    @GetMapping("/testUserList")
    @ResponseBody
    public String testUserList(){
        PageInfo<BaseUsers> list = usersService.selectBaseUsers(null,0,0);
        return JSON.toJSONString(list);
    }

}
