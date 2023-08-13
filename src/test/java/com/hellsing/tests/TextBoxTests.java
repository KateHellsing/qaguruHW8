package com.hellsing.tests;

import com.hellsing.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTest() {
        textBoxPage.openPage()
                .seUserName("Kate Hell")
                .setUserEmail("kate@test.ru")
                .setCurrentAddress("Lenina 666, Moscow, Russia")
                .setPermanentAddress("Lenina 667, Moscow, Russia")
                .submit()
                .checkResult(
                        "Kate Hell",
                        "kate@test.ru",
                        "Lenina 666, Moscow, Russia",
                        "Lenina 667, Moscow, Russia");

    }
}
