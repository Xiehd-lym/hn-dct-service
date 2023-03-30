package com.ahzx.hndctservice.service.impl;

import com.ahzx.hndctservice.entity.SysDictType;
import com.ahzx.hndctservice.mapper.SysDictDataMapper;
import com.ahzx.hndctservice.mapper.SysDictTypeMapper;
import com.ahzx.hndctservice.service.ISysDictTypeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  字典类型 业务层处理 *
 * @Author xiehd
 * @Date 2023 03 29
 **/
@Service
public class SysDictTypeServiceImpl implements ISysDictTypeService {

    @Autowired
    private SysDictTypeMapper dictTypeMapper;

    @Override
    public List<SysDictType> selectDictTypeByTemplate(String dictType) {
        QueryWrapper<SysDictType> sysDictTypeQueryWrapper = new QueryWrapper<>();
        sysDictTypeQueryWrapper.likeRight("dict_type",dictType);
        return dictTypeMapper.selectList(sysDictTypeQueryWrapper);
    }

}
