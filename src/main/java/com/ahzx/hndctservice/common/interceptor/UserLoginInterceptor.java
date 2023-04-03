package com.ahzx.hndctservice.common.interceptor;

import com.ahzx.hndctservice.common.exception.JWTDecodeException;
import com.ahzx.hndctservice.common.exception.UserLoginException;
import com.ahzx.hndctservice.common.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登录拦截器 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

    /**
     * 拦截器：验证用户是否登录 *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("执行了拦截器的preHandle方法");
        // 从 request 的 header 中获得 token 值
        String token = request.getHeader("Authorization");
        log.info("-------token-------:{}",token);
        if (StringUtils.isBlank(token)) {
            throw new UserLoginException();
        }
        // 验证 token, JwtUtil 是自己定义的类，里面有个方法验证 token
        String sub = JwtUtils.validateToken(token);
        if (StringUtils.isBlank(sub)) {
            throw new JWTDecodeException();
        }
        // 更新 token 有效时间
        if (JwtUtils.isNeedUpdate(token)) {
            // 过期就创建新的 token 给前端
            String newToken = JwtUtils.createToken(sub);
            response.setHeader(JwtUtils.USER_LOGIN_TOKEN, newToken);
        }
        return true;
    }

    /***
     * 整个请求结束之后被调用，也就是在DispatchServlet渲染了对应的视图之后执行（主要用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("执行了拦截器的afterCompletion方法");
    }
}
