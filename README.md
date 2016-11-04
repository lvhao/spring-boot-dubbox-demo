# spring-boot-dubbox-demo 
## Spring Boot intergrate with Dubbox based on annotation demo
## Spring Boot + dubbox全注解方式实例

# 项目结构说明
> * __dubbo-starter__ 提供类似spring boot starter功能，自动添加dubbox依赖，配置文件自动解析等。
> * __api__ 提供domain model 和 service api
> * __order-center__ 依赖api接口，实现OrderService
> * __user-center__ 依赖api接口，实现UserService

# 问题及注意事项

* 如何实现自己的Spring Boot Starter以及如何配置Dubbox?
请参考 __dubbo-starter__ 项目，注意 __spring.factories__ 文件位置及作用。
* Spring Boot 非web环境如何启动Dubbo服务？ 

```java
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
        Thread.currentThread().join();
    }
}
```

* Spring Boot + Dubbo + Junit ？

```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppMain.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE) // 非Web环境，否则会尝试加载WebContext导致报错
public class TestBase {
}
```
