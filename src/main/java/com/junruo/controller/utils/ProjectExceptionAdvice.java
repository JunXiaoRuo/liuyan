package com.junruo.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: JunRuo
 * @Date: 20:17 2022/7/19
 * @Description:
 * @Version v1.0
 */

//SpringMVC异常处理器

@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex){
        //记录日志
        //通知运维
        //通知开发
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试");

    }

}
