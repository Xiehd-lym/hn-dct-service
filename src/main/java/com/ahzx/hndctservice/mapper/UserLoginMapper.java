package com.ahzx.hndctservice.mapper;

import com.ahzx.hndctservice.entity.BizCollector;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 *  用户登录 数据层 *
 * @Author xiehd
 * @Date 2023 03 29
 **/
@Mapper
public interface UserLoginMapper extends BaseMapper<BizCollector> {

    public String getAreaNameByCity(String city);
}
