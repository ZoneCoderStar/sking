package com.sking.mapper;

import com.sking.entity.QrtzJobDetails;
import com.sking.model.JobAndTrigger;
import com.tk.mybatis.MyMapper;

import java.util.List;

public interface QrtzJobDetailsMapper extends MyMapper<QrtzJobDetails> {
    List<JobAndTrigger> getJobAndTriggerDetails();
}