package com.github.springbootdubboxdemo.usercenter.config.dubbox;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dubbo配置选项
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

    @Value("${dubbo.application.org}")
    private String applicationOrg;

    @Value("${dubbo.registry.address}")
    private String registryAddress;

    @Value("${dubbo.registry.zookeeper.client}")
    private String zookeeperClient;

    @Value("${dubbo.protocol.name}")
    private String protocolName;

    @Value("${dubbo.protocol.port}")
    private int protocolPort;

    /**
     * 应用配置
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(applicationName);
        applicationConfig.setOwner(applicationOwner);
        applicationConfig.setOrganization(applicationOrg);
        return applicationConfig;
    }

    /**
     * 注册配置
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(registryAddress);
        registryConfig.setClient(zookeeperClient);
        return registryConfig;
    }

    /**
     * 默认dubbo协议
     *
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName(protocolName);
        protocolConfig.setPort(protocolPort);
        protocolConfig.setThreads(10);
        return protocolConfig;
    }

    /**
     * 基于注解的dubbox service配置
     *
     * 必须被标注为 static
     * AnnotationBean是{@link org.springframework.beans.factory.config.BeanFactoryPostProcessor}类型
     * 该类型由于会对其他标注了@Autowired,@Value,@PostConstruct 等注解的类进行增强处理，所以必须提前初始化
     * 标注为 static后 不需要依赖@Configuration的类实例即可使用
     *
     * @param annotationPackage
     * @return
     */
    @Bean
    public static AnnotationBean annotationBean(
            @Value("${dubbo.annotation.package}") String annotationPackage){
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(annotationPackage);
        return annotationBean;
    }
}
