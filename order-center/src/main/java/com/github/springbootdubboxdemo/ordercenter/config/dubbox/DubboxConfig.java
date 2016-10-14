package com.github.springbootdubboxdemo.ordercenter.config.dubbox;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置选项
 *
 * @author: lvhao
 * @since: 2016-10-13 20:10
 */
@Configuration
public class DubboxConfig {

    @Value("${dubbo.application.name}")
    private String applicationName;

    @Value("${dubbo.application.owner}")
    private String applicationOwner;

    @Value("${dubbo.registry.address}")
    private String registryAddress;

    @Value("${dubbo.annotation.package}")
    private String annotationPackage;

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(applicationName);
        applicationConfig.setOwner(applicationOwner);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registryAddress);
        return registryConfig;
    }

    @Bean
    public AnnotationBean annotationBean(){
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(annotationPackage);
        return annotationBean;
    }
}
