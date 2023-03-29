package com.ahzx.hndctservice.service;

import com.ahzx.hndctservice.entity.SysDictData;

import java.util.List;

/**
 * *
 */
public interface ISysDictDataService {

    List<SysDictData>  selectDictDataByType(String dictType);
}
