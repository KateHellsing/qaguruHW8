package com.hellsing.tests;

import com.hellsing.pages.RegistrationPage;
import com.hellsing.utils.UserVariables;
import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    UserVariables utils = new UserVariables();

    @Test
    void fillRegistrationFormTest() {

        registrationPage.openPage()
                .setFirstName(utils.firstName)
                .setLastName(utils.lastName)
                .setUserEmail(utils.userEmail)
                .setGender(utils.genderWrapper)
                .setUserNumber(utils.userNumber)
                .setBirthDate(utils.birthDay, utils.birthMonth, utils.birthYear)
                .setUserHobbies(utils.hobbiesWrapper)
                .setUploadPicture(utils.uploadPicture)
                .setCurrentAddress(utils.currentAddress)
                .setSubjectsInput(utils.subjectsInput)
                .setState(utils.state)
                .setCity(utils.city)
                .clickSubmit();

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult(utils.firstName)
                .verifyResult(utils.lastName)
                .verifyResult(utils.userEmail)
                .verifyResult(utils.genderWrapper)
                .verifyResult(utils.userNumber)
                .verifyResult(utils.birthDay + " " + utils.birthMonth + "," + utils.birthYear)
                .verifyResult(utils.subjectsInput)
                .verifyResult(utils.hobbiesWrapper)
                .verifyResult(utils.uploadPicture)
                .verifyResult(utils.currentAddress)
                .verifyResult(utils.state + " " + utils.city)
                .closeModalVerify();
    }
}