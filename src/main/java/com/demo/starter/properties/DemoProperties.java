package com.demo.starter.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置信息：@ConfigurationProperties(prefix = "demo") 它可以把相同前缀的配置信息通过配置项名称映射成实体类，
 * 比如我们这里指定 prefix = "demo" 这样，我们就能将以demo为前缀的配置项拿到了。
 * ps：其实这个注解很强大，它不但能映射成String或基本类型的变量。还可以映射为List，Map等数据结构。
 */
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
    private String sayWhat;
    private String toWho;

    public String getSayWhat() {
        return sayWhat;
    }

    public void setSayWhat(String sayWhat) {
        this.sayWhat = sayWhat;
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
}
