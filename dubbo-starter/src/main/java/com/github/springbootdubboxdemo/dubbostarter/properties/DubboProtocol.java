package com.github.springbootdubboxdemo.dubbostarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.github.springbootdubboxdemo.dubbostarter.properties.DubboConfigConst.DUBBO_PROTOCOL_CFG_PREFIX;

/**
 * 对外接口协议端口
 *
 * @author: lvhao
 * @since: 2016-10-17 12:36
 */
@ConfigurationProperties(prefix = DUBBO_PROTOCOL_CFG_PREFIX)
public class DubboProtocol {

    private String name;
    private String host;
    private int port;
    private int threadCount;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DubboProtocol{");
        sb.append("host='").append(host).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", port=").append(port);
        sb.append(", threadCount=").append(threadCount);
        sb.append('}');
        return sb.toString();
    }
}
