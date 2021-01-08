package Service;

import MyWorkers.Ceo;
import MyWorkers.Worker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Worker Service is abstract class, all functions ae static.
 */


public abstract class WorkerService {


    //---------------------------------1

    /**
     * Print all information about workers
     */

    public static void printAllWorkers(List<Worker> o, String language) {
        int x = 0;
        if (language == "true") {
            for (int i = 0; i < o.size(); i++) {

                System.out.println("----Member " + ++x + "----");
                System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName());
                if (o.get(i).getGender() == 'f') {
                    System.out.println("Gender: Female");
                } else {
                    System.out.println("Gender: Male");
                }
                System.out.println("Experience in months: " + o.get(i).getExperience());
                System.out.println("------------------------");
            }
        } else {
            for (int i = 0; i < o.size(); i++) {

                System.out.println("----Աշխատող " + ++x + "----");
                System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName());
                if (o.get(i).getGender() == 'f') {
                    System.out.println("Սեռը: Իգական");
                } else {
                    System.out.println("Սեռը: Արական");
                }
                System.out.println("Աշխատանքային փորձը ամիսներով: " + o.get(i).getExperience());
                System.out.println("------------------------");
            }
        }
    }

    //--------------------------------2

    /**
     * Print all male workers
     */

    public static void printAllMaleWorkers(List<Worker> o, String language) {
        if (language == "true") {
            for (int i = 0; i < o.size(); i++) {

                if (o.get(i).getGender() == 'm') {
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + " is male worker");
                    System.out.println();
                }


            }
        } else {
            for (int i = 0; i < o.size(); i++) {

                if (o.get(i).getGender() == 'm') {
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + " արական սեռի աշխատող է");
                    System.out.println();
                }
            }
        }
        System.out.println("------------------------");
    }

    //--------------------------------3

    /**
     * Print worker who has minimal experience
     */

    public static void printMinExpOfWorkers(List<Worker> o, String language) {
        String name = o.get(0).getFirstName() + " " + o.get(0).getLastName();
        double min = o.get(0).getExperience();
        for (int i = 0; i < o.size(); i++) {
            if (min > o.get(i).getExperience()) {
                min = o.get(i).getExperience();
                name = o.get(i).getFirstName() + " " + o.get(i).getLastName();
            }
        }
        if (language == "true") {
            System.out.println(name + " has " + min + " experience");
        } else {
            System.out.println(name + "ը ունի " + min + " աշխատանքային փորձ");
        }
        System.out.println("------------------------");
    }


    //----------------------------------4

    /**
     * Print female worker who has biggest experience
     */

    public static void printFemaleWorkersBiggestExp(List<Worker> o, String language) {
        List<Worker> w1 = new LinkedList<>();
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getGender() == 'f') {
                w1.add(o.get(i));
            }
        }
        Worker max = Collections.max(w1, (o1, o2) -> (int) (o1.getExperience() - o2.getExperience()));

        if (language == "true") {
            System.out.println(max.getFirstName() + " " + max.getLastName() + " : " + max.getExperience() + " experience");
        } else {
            System.out.println(max.getFirstName() + " " + max.getLastName() + " : " + max.getExperience() + " աշխատանքային փորձ");
        }

        w1.clear();
        System.out.println("------------------------");

    }


    //-----------------------------------5

    /**
     * Print male workers whose are old 21 year
     */

    public static void printMaleWorkerGreatThan21(List<Worker> o, String language) {
        int x;
        if (language == "true") {
            for (int i = 0; i < o.size(); i++) {
                if (o.get(i).getGender() == 'm' && 2000 > o.get(i).getYear()) {
                    x = 2021 - o.get(i).getYear();
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + ":" + x + " years old");
                }

            }
        } else {
            for (int i = 0; i < o.size(); i++) {
                if (o.get(i).getGender() == 'm' && 2000 > o.get(i).getYear()) {
                    x = 2021 - o.get(i).getYear();
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + ":" + x + " տարեկան");
                }
            }

        }System.out.println("------------------------");
    }
    //--------------------------------------6

    /**
     * Print female workers whose are old 21 year
     */

    public static void printFemaleWorkerGreatThan21(List<Worker> o, String language) {
        int x;
        if (language == "true") {
            for (int i = 0; i < o.size(); i++) {
                if (o.get(i).getGender() == 'f' && 2000 > o.get(i).getYear()) {
                    x = 2021 - o.get(i).getYear();
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + ":" + x + " years old");
                }

            }
        } else {
            for (int i = 0; i < o.size(); i++) {
                if (o.get(i).getGender() == 'f' && 2000 > o.get(i).getYear()) {
                    x = 2021 - o.get(i).getYear();
                    System.out.println(o.get(i).getFirstName() + " " + o.get(i).getLastName() + ":" + x + " Տարեկան");
                }
            }

        }
        System.out.println("------------------------");
    }

//----------------------------------------7

    /**
     * Print female smallest worker
     * if worker`s years are equal , then function is printing the first persons info
     */

    public static void printFemaleSmallestWorker(List<Worker> o, String language) {
        int max = o.get(0).getYear();
        String maxName = o.get(0).getFirstName() + " " + o.get(0).getLastName();
        for (int i = 0; i < o.size(); i++) {

            if (o.get(i).getGender() == 'f') {
                if (max < o.get(i).getYear()) {
                    max = o.get(i).getYear();
                    maxName = o.get(i).getFirstName() + " " + o.get(i).getLastName();
                }
            }
        }
        if (language == "true") {
            System.out.println(maxName + ":" + max + " is smallest female worker");
        }else {
            System.out.println(maxName + ":" + max + " իգական սեռի ամենափոքր աշխատողն է");
        }

        System.out.println("------------------------");
    }


    //--------------------------------------------8

    /**
     * Print male smallest worker
     * if worker`s years are equal , then function is printing the first persons info
     */

    public static void printMaleSmallestWorkers(List<Worker> o, String language) {
        int min = o.get(0).getYear();
        ;
        String minName = o.get(0).getFirstName() + " " + o.get(0).getLastName();
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getGender() == 'm') {
                if (min < o.get(i).getYear()) {
                    min = o.get(i).getYear();
                    minName = o.get(i).getFirstName() + " " + o.get(i).getLastName();
                }
            }
        }
        if (language == "true") {
        System.out.println(minName + ":" + min + " is smallest male worker");}
        else{
            System.out.println(minName + ":" + min + " արական սեռի ամենափոքր աշխատողն է");
        }
        System.out.println("------------------------");
    }

//---------------------------------------------------------

    /**
     * Creating person
     * Name and lastname must start at UPPERCASE
     * Year must be big then "1900" (year >1900)
     * Gender must be "f" or "m"
     * Experience must be "number.number"
     */

    public static void createPerson(String path, String language) {
        if (language == "true"){
        System.out.println("----Please input  person----");
        System.out.println("Example: Name,Lastname,Year,Gender,Years of work experience\n");
        System.out.println("Name: must start at UPPER CASE ");
        System.out.println("Lastname: must start at UPPER CASE ");
        System.out.println("Year: must be NUMBERS  (Ex. 1998 , 1900<x<2020) ");
        System.out.println("Gender: must be m(male) or f(female)");
        System.out.println("Years of work experience: must be NUMBERS (Ex.YEARS.MONTHS  4.3 ");}
        else{
            System.out.println("----Մուտքագրեք անձի տվյալներ----");
            System.out.println("----Լռացնել անգլերեն տառերով----");
            System.out.println("Օրնակ:Անուն,Ազգանուն,տարիք,սեռ,աշխ փորձ");
            System.out.println("Անուն:Պետք է սկսվի մեծատառով");
            System.out.println("Ազգանուն:Պետք է սկսվի մեծատառով");
            System.out.println("Տարիք:Պետք է լինի 1900<x<2020 ,օր 1998");
            System.out.println("Սեռ:(m) արական կամ (f) իգական");
            System.out.println("Աշխ փարձ:օրինակ 4.3 , 4 տարի 3 ամիս");
        }

        Scanner scanner = new Scanner(System.in);
        if (language == "true"){
        System.out.println("----Create  Person----");}

        else{
            System.out.println("----Մուտքագրել անձ----");
        }
        String firstPerson = scanner.nextLine();

        String[] split1 = firstPerson.split(",", firstPerson.length());


        if (Character.isUpperCase(split1[0].charAt(0)) && Character.isUpperCase(split1[1].charAt(0))
                && split1[0].matches("[A-z][a-z]+") && split1[1].matches("[A-z][a-z]+")
                && split1[2].matches("[0-9]+") && Integer.parseInt(split1[2]) > 1900
                && Integer.parseInt(split1[2]) < 2020 && (split1[3].charAt(0) == 'f' || split1[3].charAt(0) == 'm')
                && split1[4].matches("^[0-9]+[.][0-9]+")) {

            String gg = firstPerson + "\n";
            try {
                Files.write(Paths.get(path), gg.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            if (language == "true"){
            System.out.println("!!!INVALID INPUT!!!");}
            else{
                System.out.println("!!!Սխալ մուռքագրում!!!");
            }
            System.out.println();
            System.out.println();
            createPerson(path,language);
        }
        if (language == "true"){
        System.out.println("Please go previous page for Refresh");}
        else{
            System.out.println("Խնրում եմ վերադարձեք նախորդ էջ ցուցակը թարմացնելու համար");
        }
    }

    public static void deleteWorker(String path, List<Worker> o,String language) {
        try {
            List<String> read = FileService.read(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        printAllWorkers(o,language);

        if (language == "true"){
        System.out.println("Witch worker do you want to dismiss from work ???");
        System.out.println("Please input workers number");}
        else{
            System.out.println("Որ աշխատողին եք ցանկանում հեռացնել");
            System.out.println("Խնդրում եմ մուտքագրեք համարը");
        }
        Scanner sss = new Scanner(System.in);
        int command = sss.nextInt();
        if (command > o.size() || command == 0) {
            if (language == "true"){
            System.out.println("invalid input");}
            else{
                System.out.println("Սխալ մուտքագրում");
            }
        }
        o.remove(--command);
        for (int i = 0; i < o.size(); i++) {
            String gg = o.get(i).getFirstName() + "," + o.get(i).getLastName() + "," + o.get(i).getYear() + "," + o.get(i).getGender() + "," + o.get(i).getExperience() + "\n";
            try {
                if (i == 0) {
                    Files.write(Paths.get(path), gg.getBytes());
                    gg = "";
                }
                Files.write(Paths.get(path), gg.getBytes(), StandardOpenOption.APPEND);
                gg = "";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (language == "true"){
        System.out.println("----Done----");
        System.out.println("Please go previous page for Refresh");}
        else{
            System.out.println("----Ընդունված է----");
            System.out.println("Խնրում եմ վերադարձեք նախորդ էջ ցուցակը թարմացնելու համար");
        }
        System.out.println();

    }

}

