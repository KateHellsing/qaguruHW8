package com.hellsing.pages;

import com.codeborne.selenide.SelenideElement;
import com.hellsing.pages.components.CalendarComponent;
import com.hellsing.pages.components.ResultsModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    ResultsModal resultsModal = new ResultsModal();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            subjectsInput = $("input#subjectsInput"),
            state = $("#stateCity-wrapper #state"),
            stateInput = $("#state"),
            city = $("#stateCity-wrapper #city"),
            cityInput = $("#city"),
            addFormSubmit = $("#submit"),
            closeModal = $("#closeLargeModal");
    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }
    public RegistrationPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genterWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        new CalendarComponent().setDate(day, month, year);

        return this;
    }

    public RegistrationPage setUserHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public RegistrationPage setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage choiceState(String value) {
        state.click();
        stateInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage choiceCity(String value) {
        city.click();
        cityInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage clickSubmit() {
        addFormSubmit.click();

        return this;
    }

    public RegistrationPage verifyRegistrationResultModalAppears() {
        resultsModal.verifyModal();

        return this;
    }

    public RegistrationPage verifyResult(String key) {
        resultsModal.verifyResult(key);

        return this;
    }

    public RegistrationPage closeModalVerify() {
        closeModal.click();

        return this;
    }
}