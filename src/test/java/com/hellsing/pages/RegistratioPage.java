package com.hellsing.pages;

import com.codeborne.selenide.SelenideElement;
import com.hellsing.pages.components.CelendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistratioPage {

    CelendarComponent calendar = new CelendarComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterWrapperInput = $("#genterWrapper"),
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
            thanksText = $("#example-modal-sizes-title-lg"),
            tableResponsive = $(".table-responsive"),
            closeLargeModal = $("#closeLargeModal");
    public RegistratioPage openPage() {
        open("/automation-practice-form");
        // код для скрытия рекламы и футер
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistratioPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistratioPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistratioPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistratioPage setGender(String value) {
        genterWrapperInput.$(byText(value)).click();

        return this;
    }

    public RegistratioPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistratioPage setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistratioPage setUserHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistratioPage setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public RegistratioPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public RegistratioPage setSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistratioPage choiceState(String value) {
        state.click();
        stateInput.$(byText(value)).click();

        return this;
    }

    public RegistratioPage choiceCity(String value) {
        city.click();
        cityInput.$(byText(value)).click();

        return this;
    }

    public RegistratioPage clickSubmit() {
        addFormSubmit.click();

        return this;
    }

    public RegistratioPage thxForm(String value) {
        thanksText.shouldHave(text(value));

        return this;
    }

    public RegistratioPage checkResult(String value) {
        tableResponsive.shouldHave(text(value));

        return this;
    }

    public RegistratioPage closeModal() {
        closeLargeModal.click();

        return this;
    }
}