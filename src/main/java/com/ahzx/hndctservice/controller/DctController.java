package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.entity.vo.BaseDataReqVo;
import com.ahzx.hndctservice.entity.vo.ListDataReqVo;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(value = "相关接口")
@RestController
@RequestMapping("/api/selectDctData")
@Slf4j
public class DctController {

    /**
     * *
     * @param pageNum
     * @param pageSize
     * @param listDataReqVo
     *
     *      //当前页
     *      private int pageNum;
     *      //每页的数量
     *      private int pageSize;
     *      //当前页的数量
     *      private int size;
     *      //当前页面第一个元素在数据库中的行号
     *      private int startRow;
     *      //当前页面最后一个元素在数据库中的行号
     *      private int endRow;
     *      //总记录数
     *      private long total;
     *      //总页数
     *      private int pages;
     *
     */
    // 列表查询
    @PostMapping("/dataListByPage")
    public R dataList(@RequestParam(defaultValue = "1") int pageNum,
                      @RequestParam(defaultValue = "10") int pageSize,
                      @RequestBody ListDataReqVo listDataReqVo){
        // todo 分页
        
        PageHelper.startPage(pageNum, pageSize);

        return R.error();
//        Page<CheckItem> page = checkItemDao.selectByCondition(queryString);
        // 查询结果的记录总数
//        long total = page.getTotal();
//        List<CheckItem> rows = page.getResult();
//        return new PageResult(total, rows);

//        PageInfo<LoginVo> loginVoPageInfo = new PageInfo<>();
    }

    /**-----------------------------**采集详情页**-----------------------------**/

    /**
     * 基本信息 *
     * @param baseDataReqVo
     */
    @PostMapping("/baseData")
    public void baseData(@RequestBody BaseDataReqVo baseDataReqVo){
        // todo
        
    }

    /**
     * 详情查询 *
     */
    @GetMapping("/dataDetail")
    public void dataDetail(){
        // todo
        
    }

    /**
     * 详情录入 *
     */
    @GetMapping("/dataInsert")
    public void dataInsert(){
        
        // todo
    }

}
