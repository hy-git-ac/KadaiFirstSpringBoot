package com.techacademy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable int val1) {
        String dateStr = String.valueOf(val1);
        LocalDate ld = LocalDate.parse(dateStr, DateTimeFormatter.BASIC_ISO_DATE);
        String dow = ld.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE);
        return dow;
    }


    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        return val1 + val2;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        return val1 - val2;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTImes(@PathVariable int val1, @PathVariable int val2) {
        return val1 * val2;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        return val1 / val2;
    }

}
