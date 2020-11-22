package Main;


import MyWorkers.Ceo;
import MyWorkers.Developer;
import MyWorkers.QA_specialist;
import MyWorkers.Support;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class MyCompany {
    public static void main(String[] args) {

        System.out.println("*********CEO**********");
        Ceo c1 = new Ceo("Raz", "Mkhitaryan", 1996,
                'm', true, "100.000$", 3,
                "Ms Office, Java, C++", 4, "English , Russian, Armenian");
        c1.printInfo();
        System.out.println("*******************");
        System.out.println();

        Developer d1 = new Developer("Ashot", "Margaryan", 1996,
                true,
                "Java, C++, C#", 1, "English , Russian, Armenian", 'm');
        System.out.println("*********MyWorkers.Developer**********");
        d1.printInfo();
        System.out.println("*******************");
        System.out.println();

        QA_specialist q1 = new QA_specialist("Karen", "Vardanyan", 1994,
                true,
                "Selenium, Apium, AzureDevOps, TestComplate", 2, "English , Russian, Armenian", 'm');
        System.out.println("********QA Specialist***********");
        q1.printInfo();
        System.out.println("*******************");
        System.out.println();

        Support s1 = new Support("Narine", "Ghazaryan", 1980,
                false, "Ms Office", 3,
                "English , Russian, Armenian , Spanish, German, French", 'f');
        System.out.println("********MyWorkers.Support Specialist***********");
        s1.printInfo();
        System.out.println("*******************");

        Date date = new Date();
        LocalDate now = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();


        System.out.println("Factorial is: " + c1.factorial(5));

        System.out.println("Fibonachi is: " + s1.fibonachi(8));

        System.out.print("Is " + c1.getName() + " knows Java ? ");
        c1.javaCoding(true);

        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss a");
        System.out.println(sdf.format(date));
        System.out.println("Day of Week is: " + now.getDayOfWeek().toString().toLowerCase());
        System.out.println("Day of year is: " + dateTime.getDayOfYear());
    }
}
