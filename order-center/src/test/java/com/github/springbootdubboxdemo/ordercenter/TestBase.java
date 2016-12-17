package com.github.springbootdubboxdemo.ordercenter;

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
        webEnvironment = SpringBootTest.WebEnvironment.NONE) // 非Web环境，否则会尝试加载WebContext
public class TestBase {
}
