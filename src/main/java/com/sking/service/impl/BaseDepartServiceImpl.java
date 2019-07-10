package com.sking.service.impl;

import com.sking.mapper.BaseDepartMapper;
import com.sking.service.BaseDepartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("baseDepartService")
public class BaseDepartServiceImpl implements BaseDepartService {
    @Resource
    BaseDepartMapper baseDepartMapper;

}
