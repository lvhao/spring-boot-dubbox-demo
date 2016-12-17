package com.github.springbootdubboxdemo.dubbostarter.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import com.alibaba.dubbo.config.spring.schema.DubboBeanDefinitionParser;
import com.github.springbootdubboxdemo.dubbostarter.properties.DubboApplication;
import com.github.springbootdubboxdemo.dubbostarter.properties.DubboProtocol;
import com.github.springbootdubboxdemo.dubbostarter.properties.DubboProvider;
import com.github.springbootdubboxdemo.dubbostarter.properties.DubboRegistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.springbootdubboxdemo.dubbostarter.properties.DubboConfigConst.DUBBO_ANNOTATION_CFG_PACKAGE;

/**
 * starter自动配置Dubbo
 *
 * @author: lvhao
 * @since: 2016-10-17 12:28
 */
@Configuration
@ConditionalOnClass(DubboBeanDefinitionParser.class)
@EnableConfigurationProperties({
        DubboRegistry.class,
        DubboProtocol.class,
        DubboProvider.class,
        DubboApplication.class
})
public class DubboAutoConfiguration {

    @Autowired
    private DubboRegistry dubboRegistry;

    @Autowired
    private DubboProtocol dubboProtocol;

    @Autowired
    private DubboProvider dubboProvider;

    @Autowired
    private DubboApplication dubboApplication;

    /**
     * 应用配置
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubboApplication.getName());
        applicationConfig.setOwner(dubboApplication.getOwner());
        applicationConfig.setOrganization(dubboApplication.getOwner());
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
        registryConfig.setProtocol(dubboRegistry.getProtocol());
        registryConfig.setAddress(dubboRegistry.getAddress());
        registryConfig.setRegister(dubboRegistry.isRegister());
        registryConfig.setSubscribe(dubboRegistry.isSubscribe());
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
        protocolConfig.setName(dubboProtocol.getName());
        protocolConfig.setHost(dubboProtocol.getHost());
        protocolConfig.setPort(dubboProtocol.getPort());
        protocolConfig.setThreads(dubboProtocol.getThreadCount());
        return protocolConfig;
    }

    /**
     * provider 配置
     * @return
     */
    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(dubboProvider.getTimeout());
        providerConfig.setRetries(dubboProvider.getRetries());
        providerConfig.setDelay(dubboProvider.getDelay());
        return providerConfig;
    }

    /**
     * 基于注解的dubbo service配置
     *
     * 必须被标注为 static
     * AnnotationBean是{@link org.springframework.beans.factory.config.BeanFactoryPostProcessor}类型
     * 该类型由于会对其他标注了@Autowired,@Value,@PostConstruct 等注解的类进行增强处理，所以必须提前初始化
     * 标注为 static后 不需要依赖@Configuration标注的类实例即可使用
     *
     * @return
     */
    @Bean
    public static AnnotationBean annotationBean(@Value("${"+DUBBO_ANNOTATION_CFG_PACKAGE+"}") String scanPackage){
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(scanPackage);
        return annotationBean;
    }
}
