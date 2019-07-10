package com.sking.service.impl;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseUsers;
import com.sking.mapper.BaseUsersMapper;
import com.sking.service.BaseUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("baseUsersService")
public class BaseUsersServiceImpl implements BaseUsersService {
    @Resource
    BaseUsersMapper baseUsersMapper;

    public PageInfo<BaseUsers> selectBaseUsers(BaseUsers user, Integer pageNum, Integer pageSize){
        List<BaseUsers> list = baseUsersMapper.select(user);
        PageInfo<BaseUsers> page = new PageInfo<BaseUsers>(list);
        return page;
    }

    public BaseUsers selectBaseUsersByLoginnum(String loginnum){
        BaseUsers user = new BaseUsers();
        user.setLoginnum(loginnum);
        List<BaseUsers>list = baseUsersMapper.select(user);
        return list.size()>0?list.get(0):null;
    }
}
