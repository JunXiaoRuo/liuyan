package com.junruo.controller.utils;

import lombok.Data;

import java.util.Map;

/**
 * @Author: JunRuo
 * @Date: 18:55 2022/7/19
 * @Description:
 * @Version v1.0
 */

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }


    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }



}
