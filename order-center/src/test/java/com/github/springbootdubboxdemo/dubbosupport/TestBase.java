package com.github.springbootdubboxdemo.dubbosupport;

import com.github.springbootdubboxdemo.ordercenter.AppMain;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 *
 * @author: lvhao
 * @since: 2016-10-13 17:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppMain.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TestBase {
}
