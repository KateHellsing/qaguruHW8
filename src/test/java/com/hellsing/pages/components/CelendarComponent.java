package com.hellsing.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CelendarComponent {
    public void setDate(String day, String mouth, String year) {
        //дата рождения
        $(".react-datepicker__month-select").selectOptionContainingText(mouth);
        $(".react-datepicker__year-select").selectOptionContainingText(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();

    }
}
