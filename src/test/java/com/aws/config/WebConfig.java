package com.aws.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/web/${web}.properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("126.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("isRemote")
    @DefaultValue("true")
    boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("http://ubuntu@3.67.10.1:4444/wd/hub")
    String remoteUrl();
}