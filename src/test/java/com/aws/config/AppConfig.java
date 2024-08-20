package com.aws.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/stage/${stage}.properties"
})

public interface AppConfig extends Config {
    @Key("apiUrl" )
    @DefaultValue("" )
    String apiUrl();

    @Key("webUrl" )
    @DefaultValue("https://google.com" )
    String webUrl();

}