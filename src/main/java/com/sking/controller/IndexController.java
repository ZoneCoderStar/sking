package com.sking.controller;

import com.sking.config.CommonConst;
import com.sking.entity.BaseModules;
import com.sking.entity.BaseUsers;
import com.sking.model.BaseModulesModel;
import com.sking.service.BaseModulesService;
import com.sking.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("")
public class IndexController {

    @Autowired
    BaseModulesService modulesService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String toIndexPage(Model model){
        // 取身份信息
        BaseUsers user = ShiroUtils.getBaseUser();

        BaseModules param = new BaseModules();
        List<BaseModulesModel> baseModulesList = modulesService.selectAllModulestList(param);
        model.addAttribute("user",user);
        model.addAttribute("baseModulesList",baseModulesList);
        model.addAttribute("copyrightYear", CommonConst.getCopyrightYear());
        model.addAttribute("demoEnabled", CommonConst.isDemoEnabled());
        return "index-lay";
    }

    @RequestMapping("toInnerPage")
    public String toInnerPage(Model model){
        BaseModules param = new BaseModules();
//        param.setParentId(null);
        List<BaseModulesModel> baseModulesList = modulesService.selectAllModulestList(param);
        model.addAttribute("baseModulesList",baseModulesList);
        return "inner";
    }

    @RequestMapping("toTestListPage")
    public String toTestListPage(Model model){
        return "testlist2";
    }


    @RequestMapping("toTestListPage11")
    public String toTestListPage11(Model model){
        return "testlist";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap){
        mmap.put("version", CommonConst.getVersion());
        return "main";
    }
}
