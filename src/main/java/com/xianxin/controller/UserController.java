package com.xianxin.controller;

import com.xianxin.entity.User;
import com.xianxin.model.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author 贤心i
 * @version V1.0
 * @Title: （User）用户前端控制器
 * @Package com.xianxin.controller
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/4/26 15:36
 **/
@RestController //@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("张三丰");
        user.setSex("男");
        return user;
    }

    @GetMapping("getUser2")
    public User getUser2() {
        User user = new User();
        user.setId(2);
        user.setUsername("张三丰2");
        user.setSex("男2");
        return user;
    }

    @GetMapping("getUser3")
    public JSONResult getUser3() {
        User user = new User();
        user.setId(3);
        user.setUsername("张三丰3");
        user.setSex("男3");
        return JSONResult.ok(user);
    }

    @GetMapping("getUser4")
    public JSONResult getUser4() {//忽略不显示密码字段
        User user = new User();
        user.setId(4);
        user.setUsername("张三丰4");
        user.setPassword("1234564");
        user.setSex("男4");
        return JSONResult.ok(user);
    }


    @GetMapping("getUser5")
    public JSONResult getUser5() {//显示日期格式数据
        User user = new User();
        user.setId(5);
        user.setUsername("张三丰5");
        user.setPassword("1234565");
        user.setSex("男5");
        user.setBirthday(new Date());
        return JSONResult.ok(user);
    }

    @GetMapping("getUser6")
    public JSONResult getUser6() {//不显示空值
        User user = new User();
        user.setId(5);
        user.setUsername("张三丰5");
        user.setPassword("1234565");
        user.setSex("男5");
        user.setBirthday(new Date());
//        user.setDesc("hello springboot~");
        return JSONResult.ok(user);
    }

    @GetMapping("getUser7")
    public JSONResult getUser7() {//不显示空值
        User user = new User();
        user.setId(7);
        user.setUsername("张三丰7ss");
        user.setPassword("1234567sss");
        user.setSex("男7ssssss");
        user.setBirthday(new Date());
//        user.setDesc("hello springboot~");
        return JSONResult.ok(user);
    }
}
