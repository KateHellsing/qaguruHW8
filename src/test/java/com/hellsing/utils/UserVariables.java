package com.hellsing.utils;

public class UserVariables {

    RandomUtils randomUtils = new RandomUtils();
    public String
        firstName = randomUtils.getRandomFirstName(),
        lastName = randomUtils.getRandomLastName(),
        userEmail = randomUtils.getRandomUserEmail(),
        genderWrapper = randomUtils.getRandomGender(),
        userNumber = randomUtils.getRandomUserNumber(),
        birthDay = randomUtils.getRandomDay(),
        birthMonth = randomUtils.getRandomMonth(),
        birthYear = randomUtils.getRandomYear(),
        subjectsInput = randomUtils.getRandomSubject(),
        hobbiesWrapper = randomUtils.getRandomHobby(),
        uploadPicture = randomUtils.getRandomPicture(),
        currentAddress = randomUtils.getRandomCurrentAddress(),
        state = randomUtils.getRandomState(),
        city = randomUtils.getRandomCity(state);
}