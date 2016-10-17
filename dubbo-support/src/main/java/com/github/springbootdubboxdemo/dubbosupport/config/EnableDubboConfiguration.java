package com.github.springbootdubboxdemo.dubbosupport.config;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * dubbo注解自动配置
 *
 * @author: lvhao
 * @since: 2016-10-17 14:41
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ImportAutoConfiguration(DubboAutoConfiguration.class)
public @interface EnableDubboConfiguration {
}
