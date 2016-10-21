package com.github.springbootdubboxdemo.dubbostarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.github.springbootdubboxdemo.dubbostarter.properties.DubboConfigConst.DUBBO_REGISTRY_CFG_PREFIX;

/**
 * dubbo 注册配置
 *
 * @author: lvhao
 * @since: 2016-10-17 12:38
 */
@ConfigurationProperties(prefix = DUBBO_REGISTRY_CFG_PREFIX)
public class DubboRegistry {
    private String protocol;
    private String address;
    private boolean register;
    private boolean subscribe;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DubboRegistry{");
        sb.append("protocol='").append(protocol).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", register=").append(register);
        sb.append(", subscribe=").append(subscribe);
        sb.append('}');
        return sb.toString();
    }
}
