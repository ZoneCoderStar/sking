package com.sking.service;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseRoles;

import java.util.List;

public interface BaseRolesService {
    PageInfo<BaseRoles> selectBaseRoles(BaseRoles role, Integer pageNum, Integer pageSize);

    BaseRoles selectBaseRolesById(String roleid);

    List<BaseRoles> selectRolesListByUserid(String userid);
}
