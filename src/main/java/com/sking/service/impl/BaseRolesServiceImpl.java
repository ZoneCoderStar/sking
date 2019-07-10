package com.sking.service.impl;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseRoles;
import com.sking.mapper.BaseRolesMapper;
import com.sking.service.BaseRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("baseRolesService")
public class BaseRolesServiceImpl implements BaseRolesService {
    @Resource
    BaseRolesMapper baseRolesMapper;

    public PageInfo<BaseRoles> selectBaseRoles(BaseRoles role, Integer pageNum, Integer pageSize){
        List<BaseRoles> list = baseRolesMapper.select(role);
        PageInfo<BaseRoles> page = new PageInfo<>(list);
        return page;
    }
    public BaseRoles selectBaseRolesById(String roleid){
        BaseRoles role = baseRolesMapper.selectByPrimaryKey(roleid);
        return role;
    }

    @Override
    public List<BaseRoles> selectRolesListByUserid(String userid) {
        return baseRolesMapper.selectRolesListByUserid(userid);
    }
}
