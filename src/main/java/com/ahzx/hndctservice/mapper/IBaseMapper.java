package com.ahzx.hndctservice.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import org.springframework.stereotype.Component;

@Component
public interface IBaseMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
