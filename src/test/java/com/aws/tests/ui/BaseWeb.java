package com.aws.tests.ui;

import com.aws.helpers.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.aws.pages.GoogleSearch;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseWeb {
    GoogleSearch googleSearch = new GoogleSearch();

    @BeforeAll
    public static void init() {
        WebDriverProvider.webDriverConfigInit();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
