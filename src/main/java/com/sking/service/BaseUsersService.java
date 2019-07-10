package com.sking.service;

import com.github.pagehelper.PageInfo;
import com.sking.entity.BaseUsers;

public interface BaseUsersService {
    PageInfo<BaseUsers> selectBaseUsers(BaseUsers user,Integer pageNum, Integer pageSize);

    BaseUsers selectBaseUsersByLoginnum(String loginnum);
}
