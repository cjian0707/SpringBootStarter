package com.cjian;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: cjian
 * @Date: 2022/3/4 13:58
 * @Des: 配置类，与application.properties 或者yml文件对应
 */
@ConfigurationProperties(prefix = "cjian.test")
public class Properties {
    private String name;
    private String msg;
    private boolean enable;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
