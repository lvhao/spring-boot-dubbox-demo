package com.github.springbootdubboxdemo.dubbostarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.github.springbootdubboxdemo.dubbostarter.properties.DubboConfigConst.DUBBO_PROVIDER_CFG_PREFIX;

/**
 * 对外接口参数配置
 *
 * @author: lvhao
 * @since: 2016-10-17 12:41
 */
@ConfigurationProperties(prefix = DUBBO_PROVIDER_CFG_PREFIX)
public class DubboProvider {

    private int timeout;
    private int retries;
    private int delay;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DubboProvider{");
        sb.append("delay=").append(delay);
        sb.append(", retries=").append(retries);
        sb.append(", timeout=").append(timeout);
        sb.append('}');
        return sb.toString();
    }
}
