package com.junruo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.junruo.config.Pusher;
import com.junruo.controller.utils.R;
import com.junruo.domain.Liuyan;
import com.junruo.service.ILiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: JunRuo
 * @Date: 18:19 2022/7/19
 * @Description:
 * @Version v1.0
 */

@RestController
@RequestMapping("/liuyan")
@CrossOrigin
public class LiuyanController {

    @Autowired
    private ILiuyanService bookService;


    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Liuyan liuyan) throws IOException {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = sdf.format(d);

        liuyan.setContent(liuyan.getContent()+"<br>"+time);

        boolean flag = bookService.save(liuyan);

        if (flag){
            String name = liuyan.getName();
            if (name.equals("用户1（用于判断留言人自定义的昵称）")){
                Pusher.push("填写");
            }
            if (name.equals("用户2")){
                Pusher.push("填写");
            }
        }

        return new R(flag,flag?"添加成功！": "添加失败");
    }

    @PutMapping
    public R update(@RequestBody Liuyan liuyan){
        return new R(bookService.modify(liuyan));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Liuyan liuyan){


        IPage<Liuyan> page = bookService.getPage(currentPage, pageSize, liuyan);
        //如果当前页面值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(), pageSize, liuyan);
        }

        return new R(true,page);
    }

    @GetMapping("/logout")
    public R logout(HttpSession session, SessionStatus sessionStatus){
        session.invalidate();
        sessionStatus.setComplete();
        System.out.println("退出登录");
        return new R(true,"/login");
    }

}
