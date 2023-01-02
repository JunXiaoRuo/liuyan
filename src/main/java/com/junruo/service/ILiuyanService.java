package com.junruo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.junruo.domain.Liuyan;

/**
 * @Author: JunRuo
 * @Date: 19:16 2022/7/20
 * @Description:
 * @Version v1.0
 */
public interface ILiuyanService extends IService<Liuyan> {

    boolean saveBook(Liuyan liuyan);

    boolean modify(Liuyan liuyan);

    boolean delete(Integer id);

    IPage<Liuyan> getPage(int currentPage, int pageSize);

    IPage<Liuyan> getPage(int currentPage, int pageSize, Liuyan liuyan);
}
