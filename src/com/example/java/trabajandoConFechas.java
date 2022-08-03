package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class trabajandoConFechas {
    public static void main(String[] args) {
        //version anterior
        Date d = new Date(); //Fecha y hora actual
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009,1,28); //el mes va en medio y abarca de 0 a 11
        Date d2 = gc.getTime();
        System.out.println(d2);

        //Agregando un dia al Gregoriano
        gc.add(GregorianCalendar.DATE,1); //Se agrego un dia al 28 de Febrero por lo que debe dar 1 de Marzo
        Date d3 = gc.getTime();
        System.out.println(d3);

        //Formato a fecha
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));
        System.out.println(df.format(d3));

        //nueva version de fecha
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 202X-XX-XXTXX:xx:xx.xxx

        //Feca especifica con nueva version
        LocalDate ld = LocalDate.of(2022,8,02);
        System.out.println(ld);

        //Dando formato con la nueva version
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/d/yyyy");
        System.out.println(dtf.format(ld));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf2.format(ld));

        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf3.format(ld));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf4.format(ld));

    }
}
