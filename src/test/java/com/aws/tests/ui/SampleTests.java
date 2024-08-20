package com.aws.tests.ui;

import org.junit.jupiter.api.Test;

public class SampleTests extends BaseWeb {

    @Test
    public void testAlwaysTrue() {
        googleSearch.openPage()
                    .checkThatSearchInputDisplayed();
    }
}
