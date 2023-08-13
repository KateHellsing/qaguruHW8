package com.hellsing.tests;

import com.hellsing.pages.RegistratioPage;
import org.junit.jupiter.api.Test;


public class StudentRegistrationFormTests extends TestBase {

    RegistratioPage registratioPage = new RegistratioPage();

    @Test
    void fillRegistrationFormTest() {
        registratioPage.openPage()
                .setFirstName("Kate")
                .setLastName("Hell")
                .setUserEmail("kate@test.ru")
                .setGender("Female")
                .setUserNumber("0999660235")
                .setBirthDate("30", "May", "1998")
                .setUserHobbies("Music")
                .setUploadPicture("hw1.JPG")
                .setCurrentAddress("Lenina 666")
                .setSubjectsInput("Arts")
                .choiceState("NCR")
                .choiceCity("Noida")
                .clickSubmit()

        //проверка формы
                .thxForm("Thanks for submitting the form");
        registratioPage
                .checkResult("Kate")
                .checkResult("Hell")
                .checkResult("kate@test.ru")
                .checkResult("Female")
                .checkResult("0999660235")
                .checkResult("30 May,1998")
                .checkResult("Arts")
                .checkResult("Music")
                .checkResult("hw1.JPG")
                .checkResult("Lenina 666")
                .checkResult("NCR Noida")
                .closeModal();
    }
}