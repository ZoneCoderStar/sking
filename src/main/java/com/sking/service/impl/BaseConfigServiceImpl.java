package com.sking.service.impl;

import com.sking.entity.BaseConfig;
import com.sking.mapper.BaseConfigMapper;
import com.sking.service.BaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RuoYi首创 html调用 thymeleaf 实现参数管理
 * 
 * @author ruoyi
 */
@Service("baseConfigService")
public class BaseConfigServiceImpl implements BaseConfigService {
    @Autowired
    private BaseConfigMapper configMapper;

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configName 参数名称
     * @return 参数键值
     */
    public String getConfigValue(String configKey)
    {
        BaseConfig param = new BaseConfig();
        param.setConfigKey(configKey);
        List<BaseConfig> list =configMapper.select(param);
        BaseConfig config = list.size()>0?list.get(0):null;
        String configValue = config!=null?config.getConfigValue():"";
        return configValue;
    }
}
