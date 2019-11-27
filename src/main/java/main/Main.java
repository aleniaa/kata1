package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1993,Month.SEPTEMBER,21);      
        Person person= new Person("Francesco", date);
        System.out.println(person.getName()+" tiene "+ person.getAge()+ " años");
    }
}
