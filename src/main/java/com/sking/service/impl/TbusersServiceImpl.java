package com.sking.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sking.entity.Tbusers;
import com.sking.mapper.TbusersMapper;
import com.sking.service.TbusersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tbusersService")
public class TbusersServiceImpl implements TbusersService {
    @Resource
    TbusersMapper tbusersMapper;

    @Override
    public int insertUser(Tbusers tbusers) {
        return tbusersMapper.insert(tbusers);
    }

    @Override
    public String queryTbusers(Tbusers tbusers) {
        List<Tbusers> list = tbusersMapper.select(tbusers);
        JSONArray jsonArray = new JSONArray();
        for(Tbusers user:list){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", user.getId());
            jsonObject.put("userId",user.getUserId());
            jsonObject.put("userName",user.getUserName());
            jsonObject.put("sex",user.getSex());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }
}
