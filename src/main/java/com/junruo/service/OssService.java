package com.junruo.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: JunRuo
 * @Date: 19:16 2022/7/20
 * @Description:
 * @Version v1.0
 */
public interface OssService {

    //上传文件到OSS
    String uploadFileAvatar(MultipartFile file);

}
