package com.cjian;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: cjian
 * @Date: 2022/3/4 14:00
 * @Des: 自动装配类
 */
@Configuration
@EnableConfigurationProperties(Properties.class)//自动装配我们自定义的Properties
@ConditionalOnProperty(prefix = "cjian.test",value = "enable",matchIfMissing = true)//当enabled=true是该配置类加载
public class AutoConfiguration {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
