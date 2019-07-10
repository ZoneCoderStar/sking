package com.sking.service.impl;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseModules;
import com.sking.mapper.BaseModulesMapper;
import com.sking.model.BaseModulesModel;
import com.sking.service.BaseModulesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("baseModulesService")
public class BaseModulesServiceImpl implements BaseModulesService {
    @Resource
    BaseModulesMapper baseModulesMapper;

    public PageInfo<BaseModules> selectBaseModules(BaseModules modules, Integer pageNum, Integer pageSize){
        List<BaseModules> list = baseModulesMapper.select(modules);
        PageInfo<BaseModules> page = new PageInfo<>(list);
        return page;
    }
    public BaseModules selectBaseModulesById(String roleid){
        BaseModules module = baseModulesMapper.selectByPrimaryKey(roleid);
        return module;
    }

    @Override
    public List<BaseModules> selectModulesListByUserid(String userid) {
        return baseModulesMapper.selectModulesListByUserid(userid);
    }

    @Override
    public List<BaseModules> selectModulesList(BaseModules modules) {
        return baseModulesMapper.select(modules);
    }

    @Override
    public List<BaseModulesModel> selectAllModulestList(BaseModules modules) {
        return baseModulesMapper.selectAllModulestList(modules);
    }
}
