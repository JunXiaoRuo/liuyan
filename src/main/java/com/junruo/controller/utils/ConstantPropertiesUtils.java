package com.junruo.controller.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: JunRuo
 * @Date: 19:13 2022/7/20
 * @Description:
 * @Version v1.0
 */
//当项目已启动，Spring接口，spring加载之后，执行接口中的一个方法
@Component
public class ConstantPropertiesUtils implements InitializingBean {

    //读取配置文件内容

    @Value("${spring.cloud.alicloud.oss.endpoint}")
    private String endpoint;

    @Value("${spring.cloud.alicloud.access-key}")
    private String keyId;

    @Value("${spring.cloud.alicloud.secret-key}")
    private String keySecret;

    @Value("${spring.cloud.alicloud.bucket}")
    private String bucketName;

    //定义公开的静态的常量
    public static String END_POINT;
    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;
    public static String BUCKET_NAME;


    @Override
    public void afterPropertiesSet() throws Exception {
        END_POINT = endpoint;
        ACCESS_KEY_ID = keyId;
        ACCESS_KEY_SECRET = keySecret;
        BUCKET_NAME = bucketName;
    }
}
