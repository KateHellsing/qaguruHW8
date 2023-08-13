package com.hellsing.tests;

import com.hellsing.pages.RegistrationPage;
import org.junit.jupiter.api.Test;


public class StudentRegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillRegistrationFormTest() {
        registrationPage.openPage().removeBanner()
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
                .clickSubmit();

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult("Kate")
                .verifyResult("Hell")
                .verifyResult("kate@test.ru")
                .verifyResult("Female")
                .verifyResult("0999660235")
                .verifyResult("30 May,1998")
                .verifyResult("Arts")
                .verifyResult("Music")
                .verifyResult("hw1.JPG")
                .verifyResult("Lenina 666")
                .verifyResult("NCR Noida")
                .closeModalVerify();
    }
}