package com.ahzx.hndctservice.service.impl;

import com.ahzx.hndctservice.entity.SysDictData;
import com.ahzx.hndctservice.mapper.SysDictDataMapper;
import com.ahzx.hndctservice.service.ISysDictDataService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典数据 业务层处理 *
 * @Author xiehd
 * @Date 2023 03 29
 **/
@Service
public class SysDictDataServiceImpl implements ISysDictDataService {
    @Autowired
    private SysDictDataMapper sysDictDataMapper;

    @Override
    public List<SysDictData> selectDictDataByType(String dictType) {
        QueryWrapper<SysDictData> queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("dict_type",dictType);
        return sysDictDataMapper.selectList(queryWrapper);
    }
}
