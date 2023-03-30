package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerBt;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 保亭Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerBtService extends IService<TFarmerBt>
{
    /**
     * 查询保亭
     * 
     * @param id 保亭主键
     * @return 保亭
     */
    public TFarmerBt selectTFarmerBtById(Long id);

    /**
     * 查询保亭列表
     * 
     * @param tFarmerBt 保亭
     * @return 保亭集合
     */
    public List<TFarmerBt> selectTFarmerBtList(TFarmerBt tFarmerBt);

    /**
     * 新增保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    public int insertTFarmerBt(TFarmerBt tFarmerBt);

    /**
     * 修改保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    public int updateTFarmerBt(TFarmerBt tFarmerBt);

}
