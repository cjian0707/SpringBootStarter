package com.cjian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: cjian
 * @Date: 2022/3/4 14:11
 * @Des: 业务类
 */
@Service
public class HelloService {

    @Autowired
    private Properties properties;

    public String say() {
        return properties.getName() + " say:" + properties.getMsg();
    }
}
