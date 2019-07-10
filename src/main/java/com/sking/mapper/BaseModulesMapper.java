package com.sking.mapper;

import com.sking.entity.BaseModules;
import com.sking.model.BaseModulesModel;
import com.tk.mybatis.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseModulesMapper extends MyMapper<BaseModules> {

    List<BaseModules> selectModulesListByUserid(@Param("userid") String userid);

    List<BaseModulesModel> selectAllModulestList(BaseModules modules);
}