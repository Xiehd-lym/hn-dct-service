package com.ahzx.hndctservice.service;

import com.ahzx.hndctservice.entity.SysDictType;

import java.util.List;

public interface ISysDictTypeService {

    public List<SysDictType> selectDictTypeByTemplate(String dictType);

}
