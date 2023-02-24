package com.codurance.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Clock {

    public LocalDate today() {
        return LocalDate.now();
    }
    private static final String DATE_FORMAT = "dd/MM/yyyy";



}