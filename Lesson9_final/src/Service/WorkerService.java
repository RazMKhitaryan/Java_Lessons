package Service;

import MyWorkers.Worker;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public abstract class WorkerService {


    //-------------------------1


    public static void printAllWorkers(String[] o) {
        for (int i = 0; i < o.length; i++) {
            Worker j1 = new Worker(o[i]);


            System.out.println("Name:" + j1.getFirstName() + " " + j1.getLastName());
            System.out.println("Age: " + (2021 - j1.getYear()) + " years old");
            if (j1.getGender() == 'f') {
                System.out.println("Gender: Female");
            } else {
                System.out.println("Gender: Male");
            }
            System.out.println("Experience in months: " + j1.getExperience());
            System.out.println("------------------------");

        }


    }

    //--------------------------------2
    public static void printAllMaleWorkers(String[] o) {
        for (int i = 0; i < o.length; i++) {
            Worker j1 = new Worker(o[i]);

            if (j1.getGender() == 'm') {
                System.out.println(j1.getFirstName() + " " + j1.getLastName() + " is male worker");
            }


        }

    }

    //--------------------------------3
    public static void printMinExpOfWorkers(String[] o) {
        double minMark = 1.0;
        for (int i = 0; i < o.length; i++) {
            Worker j1 = new Worker(o[i]);

            if (j1.getExperience() <= minMark) {
                minMark = j1.getExperience();
                System.out.println("Experience less than 1 year has: " + j1.getFirstName() + " " + j1.getLastName() + " " + minMark);
            }


        }

    }

    //----------------------------------4
    public static void printFemaleWorkersBiggestExp(String[] o) {
        double max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Worker j1 = new Worker(o[i]);
            if (j1.getGender() == 'f') {
                if (max < j1.getExperience()) {
                    max = j1.getExperience();
                    maxName = j1.getFirstName() + " " + j1.getLastName();
                }
            }
        }
        System.out.println(maxName + ":" + max + " has biggest experience");

    }


    //-----------------------------------5
    public static void printMaleWorkerGreatThan21(String[] o) {
        int x;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {
            Worker j1 = new Worker(o[i]);

            if (j1.getGender() == 'm' && 2000 > j1.getYear()) {
                x = 2021 - j1.getYear();
                System.out.println(j1.getFirstName() + " " + j1.getLastName() + ":" + x + " years old");
            }

        }
    }

    //--------------------------------------6
    public static void printFemaleWorkerGreatThan21(String[] o) {
        int x;
        String maxName = "";

        for (int i = 0; i < o.length; i++) {
            Worker j1 = new Worker(o[i]);

            if (j1.getGender() == 'f' && 2000 > j1.getYear()) {
                x = 2021 - j1.getYear();
                System.out.println(j1.getFirstName() + " " + j1.getLastName() + ":" + x + " years old");
            }


        }

    }


//----------------------------------------7

    public static void printFemaleSmallestWorker(String[] o) {
        int max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Worker j1 = new Worker(o[i]);
            if (j1.getGender() == 'f') {
                if (max < j1.getYear()) {
                    max = j1.getYear();
                    maxName = j1.getFirstName() + " " + j1.getLastName();
                }
            }
        }
        System.out.println(maxName + ":" + max + " is smallest female worker");
    }


    //--------------------------------------------8
    public static void printMaleSmallestWorkers(String[] o) {
        int max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Worker j1 = new Worker(o[i]);
            if (j1.getGender() == 'm') {
                if (max < j1.getYear()) {
                    max = j1.getYear();
                    maxName = j1.getFirstName() + " " + j1.getLastName();
                }
            }
        }
        System.out.println(maxName + ":" + max + " is smallest male worker");
    }


    public static void createPerson(String path) throws Exception {
        System.out.println("----Please input  person----");
        System.out.println("Example: Name,Lastname,Year,Gender,Years of work experience\n");
        System.out.println("Name: must start at UPPER CASE ");
        System.out.println("Lastname: must start at UPPER CASE ");
        System.out.println("Year: must be NUMBERS  (Ex. 1998 , 1900<x<2020) ");
        System.out.println("Gender: must be m(male) or f(female)");
        System.out.println("Years of work experience: must be NUMBERS (Ex.YEARS.MONTHS  4.3 ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("----Create  Person----");
        String firstPerson = scanner.nextLine();

        String[] split1 = firstPerson.split(",", firstPerson.length());


        if (Character.isUpperCase(split1[0].charAt(0)) && Character.isUpperCase(split1[1].charAt(0))
                && split1[0].matches("[A-z][a-z]+") && split1[1].matches("[A-z][a-z]+")
                && split1[2].matches("[0-9]+") && Integer.parseInt(split1[2]) > 1900
                && Integer.parseInt(split1[2]) < 2020 && (split1[3].charAt(0) == 'f' || split1[3].charAt(0) == 'm')
                && split1[4].matches("^[0-9]+[.][0-9]+")) {

            String gg = firstPerson + "\n";
            Files.write(Paths.get(path), gg.getBytes(), StandardOpenOption.APPEND);

        } else {
            System.out.println("invalid input");
            createPerson(path);
        }


    }


}

