package com.sking.service;

/**
 * RuoYi首创 html调用 thymeleaf 实现参数管理
 * 
 * @author ruoyi
 */
public interface BaseConfigService {
    /**
     * 根据键名查询参数配置信息
     * 
     * @param
     * @return 参数键值
     */
    public String getConfigValue(String configKey);
}
