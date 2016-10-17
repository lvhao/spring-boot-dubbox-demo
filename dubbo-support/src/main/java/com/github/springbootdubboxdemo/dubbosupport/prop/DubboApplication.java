package com.github.springbootdubboxdemo.dubbosupport.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.github.springbootdubboxdemo.dubbosupport.prop.DubboConfigConst.DUBBO_APPLICATION_CFG_PREFIX;

/**
 * dubbo application配置
 *
 * @author: lvhao
 * @since: 2016-10-17 12:29
 */
@ConfigurationProperties(prefix = DUBBO_APPLICATION_CFG_PREFIX)
public class DubboApplication {

    private String name;
    private String owner;
    private String org;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DubboApplication{");
        sb.append("name='").append(name).append('\'');
        sb.append(", org='").append(org).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
