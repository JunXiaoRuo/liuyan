package com.junruo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junruo.dao.LiuyanDao;
import com.junruo.domain.Liuyan;
import com.junruo.service.ILiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: JunRuo
 * @Date: 17:59 2022/7/19
 * @Description:
 * @Version v1.0
 */
@Service
public class LiuyanServiceImpl extends ServiceImpl<LiuyanDao, Liuyan> implements ILiuyanService {

    @Autowired
    private LiuyanDao liuyanDao;

    @Override
    public boolean saveBook(Liuyan liuyan) {

        return liuyanDao.insert(liuyan)>0;

    }

    @Override
    public boolean modify(Liuyan liuyan) {
        return liuyanDao.updateById(liuyan) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return liuyanDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Liuyan> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        liuyanDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Liuyan> getPage(int currentPage, int pageSize, Liuyan liuyan) {
        LambdaQueryWrapper<Liuyan> lqw = new LambdaQueryWrapper<Liuyan>();

        lqw.orderByDesc(Liuyan::getId);
        IPage page = new Page(currentPage,pageSize);
        liuyanDao.selectPage(page,lqw);
        return page;
    }
}
