package com.ahzx.hndctservice.common.handler;

import com.ahzx.hndctservice.common.exception.JWTDecodeException;
import com.ahzx.hndctservice.common.exception.UserLoginException;
import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.common.result.ResultCodeEnum;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;

/**
 * 全局异常处理器 *
 * @Author xiehd
 * @Date 2023 03 27
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.UNKNOWN_REASON);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public R error(HttpMessageNotReadableException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

    @ExceptionHandler(UserLoginException.class)
    @ResponseBody
    public R error(UserLoginException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.LOGIN_AUTH);
    }

    @ExceptionHandler(JWTDecodeException.class)
    @ResponseBody
    public R error(JWTDecodeException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.JWT_ERROR);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseBody
    public R error(NoSuchElementException e){
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.TEMPLATE_ERROR);
    }

}
