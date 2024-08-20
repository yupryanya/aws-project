package com.aws.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearch {
    private static final String SEARCH_INPUT = "textarea[name='q']";

    public GoogleSearch openPage() {
        Selenide.open("");
        return this;
    }

    public void checkThatSearchInputDisplayed() {
        $(SEARCH_INPUT).isDisplayed();
    }
}
