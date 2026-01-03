package com.school.sms.common.util;

import java.time.LocalDate;
import java.time.Period;

public class AgeValidator {

    private AgeValidator() {}

    public static int calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
