package com.sking.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sking.mapper.QrtzJobDetailsMapper;
import com.sking.model.JobAndTrigger;
import com.sking.service.QrtzJobDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("qrtzJobDetailsService")
public class QrtzJobDetailsServiceImpl implements QrtzJobDetailsService {
    @Resource
    QrtzJobDetailsMapper jobMapper;

    @Override
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<JobAndTrigger> list = jobMapper.getJobAndTriggerDetails();
        PageInfo<JobAndTrigger> page = new PageInfo<>(list);
        return page;
    }
}
