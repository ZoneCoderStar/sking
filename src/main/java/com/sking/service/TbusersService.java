package com.sking.service;

import com.sking.entity.Tbusers;

public interface TbusersService {
    public int insertUser(Tbusers tbusers);

    public String queryTbusers(Tbusers tbusers);
}
