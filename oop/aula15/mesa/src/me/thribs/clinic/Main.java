package me.thribs.clinic;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) {  ;
        Patient pacientJuan = new Patient("Juan", "Perez", "12345", Date.from(
            LocalDate.of(
                2021, Month.APRIL, 10).atStartOfDay(ZoneId.systemDefault()).toInstant()
            )
        );
    }
}
