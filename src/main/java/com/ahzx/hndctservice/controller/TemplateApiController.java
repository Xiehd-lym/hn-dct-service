package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.enums.FarmerTemplateTypeEnum;
import com.ahzx.hndctservice.common.enums.NewFarmerTemplateTypeEnum;
import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.entity.SysDictData;
import com.ahzx.hndctservice.entity.SysDictType;
import com.ahzx.hndctservice.entity.vo.TemplateTypeVo;
import com.ahzx.hndctservice.service.ISysDictDataService;
import com.ahzx.hndctservice.service.ISysDictTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模板值相关接口 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Api(tags = "模板值相关接口")
@RestController
@RequestMapping("/api/template")
@Slf4j
public class TemplateApiController {


    @Autowired
    private ISysDictTypeService dictTypeService;

    @Autowired
    private ISysDictDataService dictDataService;

    @ApiOperation("根据采集范围获取所有字典数据的模板")
    @PostMapping("/getTemplate")
    public R getValueTemplate(@Validated @RequestBody TemplateTypeVo templateTypeVo){
        // 根据地区和用户类型，确定模板值，用模板值去字典数据中，模糊查询，获取所有选项框的属性值
        String area = templateTypeVo.getArea();
        String loginUserType = templateTypeVo.getLoginUserType();

        String templateName;
        // todo 待确定用户类型值
        if (loginUserType.equals("1")){
            templateName = FarmerTemplateTypeEnum.getTemplateNameByArea(area);
            return getR(templateName);
        }else {
            templateName = NewFarmerTemplateTypeEnum.getTemplateNameByArea(area);
            return getR(templateName);
        }
    }

    private R getR(String templateName) {
        List<SysDictType> sysDictTypes = dictTypeService.selectDictTypeByTemplate(templateName);

        Map<String, Object> result = new HashMap<>();
        for (SysDictType x : sysDictTypes) {
            String dictType = x.getDictType();
            List<SysDictData> sysDictData = dictDataService.selectDictDataByType(dictType);
            result.put(dictType, sysDictData);
        }
        return R.ok().message("查询成功").data(result);
    }

}
