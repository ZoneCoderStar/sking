package com.sking.service;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseModules;
import com.sking.model.BaseModulesModel;

import java.util.List;

public interface BaseModulesService {
    PageInfo<BaseModules> selectBaseModules(BaseModules role, Integer pageNum, Integer pageSize);

    BaseModules selectBaseModulesById(String modulesid);

    List<BaseModules> selectModulesListByUserid(String userid);

    List<BaseModules> selectModulesList(BaseModules modules);

    List<BaseModulesModel> selectAllModulestList(BaseModules modules);
}
