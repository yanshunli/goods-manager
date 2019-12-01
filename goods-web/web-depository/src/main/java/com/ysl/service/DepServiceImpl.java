package com.ysl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ysl.dao.DepMapper;
import com.ysl.entity.Depository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepMapper depMapper;
    @Override
    public List<Depository> list() {
        return depMapper.selectList(null);
    }
}
