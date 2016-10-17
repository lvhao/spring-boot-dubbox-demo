package com.github.springbootdubboxdemo.dubbosupport.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.github.springbootdubboxdemo.dubbosupport.prop.DubboConfigConst.DUBBO_REGISTRY_CFG_PREFIX;

/**
 * dubbo 注册配置
 *
 * @author: lvhao
 * @since: 2016-10-17 12:38
 */
@ConfigurationProperties(prefix = DUBBO_REGISTRY_CFG_PREFIX)
public class DubboRegistry {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DubboRegistry{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
