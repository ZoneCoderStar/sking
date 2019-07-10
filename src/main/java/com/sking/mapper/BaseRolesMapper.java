package com.sking.mapper;

import com.sking.entity.BaseRoles;
import com.tk.mybatis.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseRolesMapper extends MyMapper<BaseRoles> {

    List<BaseRoles> selectRolesListByUserid(@Param("userid") String userid);

}