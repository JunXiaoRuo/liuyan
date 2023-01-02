package com.junruo.controller;

import com.junruo.controller.utils.R;
import com.junruo.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: JunRuo
 * @Date: 19:15 2022/7/20
 * @Description:
 * @Version v1.0
 */
@RestController
@RequestMapping("/eduoss/fileoss")
@CrossOrigin //解决跨域问题
public class OssController {

    @Autowired
    private OssService ossService;

    //上传头像的方法
    @PostMapping
    public R uploadOssFile(MultipartFile file){

        //获取上传的文件，MultipartFile
        //返回上传到oss的路径，最后把路径上传到数据库对应字段
        String url =  ossService.uploadFileAvatar(file);
        return new R(true,url);
    }
}
