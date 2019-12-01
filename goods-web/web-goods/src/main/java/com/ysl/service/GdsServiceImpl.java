package com.ysl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ysl.dao.GdsMapper;
import com.ysl.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class GdsServiceImpl implements GdsService {
    @Autowired
    private GdsMapper gdsMapper;
    @Override
    public List<Goods> list() {
        List<Goods> list=gdsMapper.selectList(null);
        System.out.println(list);

        return list;
    }


}
