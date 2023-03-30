package com.ahzx.hndctservice.common.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;
import org.apache.commons.beanutils.converters.ShortConverter;


/**
 * Map转对象 对象转Map 工具类 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
public class MapUtils {

    /**
     * Map 转对象
     *
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass)
            throws Exception {
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();
        ConvertUtils.register(new DateConverter(null), java.util.Date.class);
        ConvertUtils.register(new LongConverter(null), Long.class);
        ConvertUtils.register(new ShortConverter(null), Short.class);
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
        ConvertUtils.register(new DoubleConverter(null), Double.class);
        ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);

        return obj;
    }

    /**
     * 对象转Map
     *
     * @param obj
     * @param incDate
     *            是否包含Date 类型的属性  true 包含； false 不包含
     * @return
     */
    public static Map<?, ?> objectToMap(Object obj, boolean incDate) {
        if (obj == null)
            return null;
        if(incDate)
            ConvertUtils.register(new DateConverter(null), java.util.Date.class);

        return new org.apache.commons.beanutils.BeanMap(obj);
    }

    /**
     *	map转map转对象,将带有下划线key，改编为驼峰式key
     *  @return Map<?,?>
     *  @param map
     *  @return
     * @throws Exception
     *
     */
    public static  Object mapToMapToObject(Map<?, ?> map,Class<?> beanClass) throws Exception{

        Map<String, Object> mapp=new HashMap<String, Object>();
        //map遍历
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            //处理下划线
            if(entry.getKey().toString().contains("_")){
                Object value = entry.getValue();
                String[] arr = entry.getKey().toString().split("_");
                StringBuffer sb = new StringBuffer();
                sb.append(arr[0]);
                for (int i=1;i<arr.length;i++){
                    arr[i]=arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                    //合并字符串
                    sb.append(arr[i]);
                }
                String key = sb.toString();
                mapp.put(key, value);
            }else {
                //不做处理部分
                String key = entry.getKey().toString();
                Object value = entry.getValue();
                mapp.put(key, value);
            }

        }

        Object obj = mapToObject(mapp, beanClass);
        return obj;
    }

}
