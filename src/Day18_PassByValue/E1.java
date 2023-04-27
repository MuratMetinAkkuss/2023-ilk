package Day18_PassByValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now();
        System.out.println(trh);

        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfYear());
        System.out.println(trh.getMonth());
        System.out.println(trh.getMonthValue());

        System.out.println("------------Plus-Minus");

        System.out.println(trh.plusYears(3)
                .plusMonths(2)
                .plusDays(10));

        System.out.println(trh.minusDays(2));

        LocalDate dogTar = LocalDate.of(1999,01,04);
        System.out.println(dogTar);

        System.out.println(dogTar.isLeapYear());

        System.out.println(trh.lengthOfYear());

        System.out.println(trh.withDayOfMonth(20));


        System.out.println("==================================");

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1999,01,04);

        Period yas = Period.between(dogumGunu,bugun);
        System.out.println(yas);
        System.out.println(yas.getYears());
        System.out.println(yas.getMonths());
        System.out.println(yas.getDays());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(dtf.format(ldt));

        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(dtf1.format(ldt));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf2.format(ldt));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d/MMM/yyyy");
        System.out.println(dtf3.format(ldt));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MMM/d");
        System.out.println(dtf4.format(ldt));



    }
}
