package com.github.springbootdubboxdemo.usercenter;

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
public class AppMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AppMain.class)
                .web(false)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
    }
}
