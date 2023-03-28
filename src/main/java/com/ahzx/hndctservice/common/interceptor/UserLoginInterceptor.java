package com.ahzx.hndctservice.common.interceptor;

import com.ahzx.hndctservice.common.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户登录拦截器 *
 * 拦截器：验证用户是否登录 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("执行了拦截器的preHandle方法");
        // 从 request 的 header 中获得 token 值
        String token = request.getHeader("authorization");
        if (token == null || token.equals("")) {
            return false;
        }
        // 验证 token, JwtUtil 是自己定义的类，里面有个方法验证 token
        String sub = JwtUtil.validateToken(token);
        if (sub == null || sub.equals("")) {
            return false;
        }
        // 更新 token 有效时间
        if (JwtUtil.isNeedUpdate(token)) {
            // 过期就创建新的 token 给前端
            String newToken = JwtUtil.createToken(sub);
            response.setHeader(JwtUtil.USER_LOGIN_TOKEN, newToken);
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
