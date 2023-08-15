package com.hellsing.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UserVariables {
    public String
            firstName,
            lastName,
            userEmail,
            genderWrapper,
            userNumber,
            birthDay,
            birthMonth,
            birthYear,
            subjectsInput,
            hobbiesWrapper,
            uploadPicture,
            currentAddress,
            state,
            city;

    public UserVariables() {
        Faker fakerEn = new Faker(new Locale("en"));
        firstName = RandomUtils.getRandomFirstName(fakerEn);
        lastName = RandomUtils.getRandomLastName(fakerEn);
        userEmail = RandomUtils.getRandomUserEmail(fakerEn);
        genderWrapper = RandomUtils.getRandomGender();
        userNumber = RandomUtils.getRandomUserNumber(fakerEn);
        birthDay = RandomUtils.getRandomDay();
        birthMonth = RandomUtils.getRandomMonth();
        birthYear = RandomUtils.getRandomYear();
        subjectsInput = RandomUtils.getRandomSubject();
        hobbiesWrapper = RandomUtils.getRandomHobby();
        uploadPicture = RandomUtils.getRandomPicture();
        currentAddress = RandomUtils.getRandomCurrentAddress(fakerEn);
        state = RandomUtils.getRandomState();
        city = RandomUtils.getRandomCity(state);
    }
}
