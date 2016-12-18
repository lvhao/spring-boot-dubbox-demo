package com.github.springbootdubboxdemo.usercenter;

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
public class AppMain implements ApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AppMain.class)
                .web(false) // 这里使用非web环境
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // dubbo 底层netty服务也是异步的，所以需要在ApplicationContext构建后阻塞
//        Thread.currentThread().join();
    }
}
