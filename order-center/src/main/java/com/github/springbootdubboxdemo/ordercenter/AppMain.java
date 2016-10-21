package com.github.springbootdubboxdemo.ordercenter;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * orderCenter程序入口
 *
 * @author: lvhao
 * @since: 2016-10-13 17:01
 */
@SpringBootApplication
public class AppMain implements ApplicationRunner{

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AppMain.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .web(false)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Thread.currentThread().join();
    }
}
