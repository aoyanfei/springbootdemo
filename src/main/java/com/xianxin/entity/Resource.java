package com.xianxin.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 贤心i
 * @version V1.0
 * @Title: 与配置文件映射的实体类
 * @Package com.xianxin.entity
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/4/26 17:44
 **/
@Configuration
@ConfigurationProperties(prefix = "com.xianxin.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
