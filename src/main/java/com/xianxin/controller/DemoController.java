package com.xianxin.controller;

import com.xianxin.entity.Resource;
import com.xianxin.entity.User;
import com.xianxin.model.JSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 贤心i
 * @version V1.0
 * @Title: SpringBoot测试前端控制器
 * @Package com.xianxin.controller
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/4/26 15:21
 **/
@RestController
@RequestMapping("/demo/")
public class DemoController {

    @Autowired
    private Resource resource;

    @RequestMapping(value = "/hello")
    public Object hello() {
        return "hello springboot~~";
    }

    @GetMapping("getResource")
    public JSONResult getResource() {//不显示空值
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return JSONResult.ok(bean);
    }

}
