package com.junruo.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.junruo.controller.utils.ConstantPropertiesUtils;
import com.junruo.service.OssService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: JunRuo
 * @Date: 19:16 2022/7/20
 * @Description:
 * @Version v1.0
 */
@Service
public class OssServiceImpl implements OssService {


    //上传文件到OSS
    @Override
    public String uploadFileAvatar(MultipartFile file) {

        //通过工具类来获取相应的值
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.ACCESS_KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.ACCESS_KEY_SECRET;
        String bucketName = ConstantPropertiesUtils.BUCKET_NAME;


        try{
            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId,accessKeySecret);

            // 获取上传文件的输入流
            InputStream inputStream = file.getInputStream();

            //获取文件名称
            String filename = file.getOriginalFilename();

            //1、在文件名称里添加一个随机唯一的值
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            filename = uuid+filename;

            //2、把文件按照日期进行分类
            // 2021/7/17/xx.jpg
            //获取当前的日期
            Date d = new Date();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String datePath = sdf.format(d);

            filename = "liuyan"+"/"+datePath+"/"+filename;

            //调用OSS方法实现上传
            //第一个参数 Bucket名称
            //第二个参数  上传到OSS文件路径和文件名称
            //第三个参数  上传文件输入流
            ossClient.putObject(bucketName, filename, inputStream);

            // 关闭OSSClient。
            ossClient.shutdown();

            //把上传之后文件路径返回
            //需要把上传到阿里云oss路径手动拼接出来
            String url = "https://"+bucketName+"."+endpoint+"/"+filename;
            return url;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
