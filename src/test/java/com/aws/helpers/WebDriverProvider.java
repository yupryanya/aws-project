package com.aws.helpers;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.*;
import static com.aws.config.App.appConfig;
import static com.aws.config.App.webConfig;

public class WebDriverProvider {
    public static void webDriverConfigInit() {
        pageLoadStrategy = "eager";
        browser = webConfig.browser();
        browserVersion = webConfig.browserVersion();
        browserSize = webConfig.browserSize();
        timeout = 15000;
        baseUrl = appConfig.webUrl();

        if (webConfig.isRemote()) {
            remote = webConfig.remoteUrl();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", browser);
            capabilities.setCapability("browserVersion", browserVersion);
            Map<String, Object> value = new java.util.HashMap<>();
            value.put("enableVNC", true);
            value.put("enableVideo", true);
            value.put("videoSize", "640x480");
            value.put("videoFrameRate", 12);
            value.put("videoCodec", "mpeg4");
            capabilities.setCapability("selenoid:options", value);
            browserCapabilities = capabilities;
        }
    }
}


