package Main;

import MyWorkers.Ceo;
import MyWorkers.Developer;
import MyWorkers.QA_specialist;
import MyWorkers.Support;

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
                "Selenium, Apium, TestComplate", 2, "English , Russian, Armenian", 'm');
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


    }
}
