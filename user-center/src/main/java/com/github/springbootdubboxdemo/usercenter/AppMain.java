package com.github.springbootdubboxdemo.usercenter;

import com.github.springbootdubboxdemo.dubbosupport.config.EnableDubboConfiguration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * userCenter程序入口
 *
 * @author: lvhao
 * @since: 2016-10-13 17:01
 */
@SpringBootApplication
@EnableDubboConfiguration
public class AppMain implements ApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AppMain.class)
                .web(false)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Thread.currentThread().join();
    }
}
