package com.sking.controller;

import com.sking.model.AjaxResult;
import com.sking.utils.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 登陆控制器
 */
@Controller
@RequestMapping
public class LoginController  extends BaseController{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/toLoginPage")
    public String toLoginPage(){
        return "login";
    }

    @PostMapping(value = "/loginCheck")
    @ResponseBody
    public AjaxResult loginCheck(
            @RequestParam(value = "username",required = true) String userName,
            @RequestParam(value = "password",required = true) String password,
            @RequestParam(value="rememberMe",required = true,defaultValue = "false") boolean rememberMe,
            HttpServletRequest request) {
        logger.info("*******************"+userName+password+rememberMe);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
//        token.setRememberMe(rememberMe);
        AjaxResult ret = new AjaxResult();
        try {
            subject.login(token);
            ret= success();
        }catch (AuthenticationException e){
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage())) {
                msg = e.getMessage();
            }
            ret= error(msg);
        }finally {
            return ret;
        }
//        return "redirect:/index";
    }


    @RequiresPermissions("user:用户管理")
    @RequestMapping("/login/success")
    @ResponseBody
    public String index(){
        return "no permission";
    }
}
