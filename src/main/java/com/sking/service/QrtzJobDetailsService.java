package com.sking.service;

import com.github.pagehelper.PageInfo;
import com.sking.model.JobAndTrigger;

public interface QrtzJobDetailsService {
    PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize);
}
