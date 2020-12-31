package Service;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import Interfaces.Movement;
import Users.User;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CeoService extends WorkerService implements CodeWriting, Languages, Movement {
    @Override
    public void javaCoding(boolean a) {
        System.out.println("Java");
    }

    @Override
    public void c_PlusPlus(boolean b) {
        System.out.println("C++");
    }

    @Override
    public void javaScript(boolean c) {
        System.out.println("JavaScript");
    }

    @Override
    public void englishKnowing(boolean a) {
        System.out.println("English");
    }

    @Override
    public void russianKnowing(boolean b) {
        System.out.println("Russian");
    }

    @Override
    public void armenianKnowing(boolean c) {
        System.out.println("Armenian");
    }

    @Override
    public void toGoToWork(boolean a) {
        System.out.println("Is going to work by car");
    }

    @Override
    public void toGoToHome(boolean b) {

    }

    @Override
    public void ToDrive(boolean c) {
        System.out.println("Knows car driving");
    }

    @Override
    public void beingMarried(boolean a) {
        System.out.println("Is married");
    }

    @Override
    public void havingFamili(boolean b) {
        System.out.println("Has family");
    }

    @Override
    public void havingCar(boolean c) {
        System.out.println("Has car");
    }


    public static void createCeo() throws Exception {
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
            Files.write(Paths.get("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Ceo.txt"), gg.getBytes());




        } else {
            System.out.println("invalid input");
            createCeo();
        }


    }

    public static List<User> setCeo(List<String> st, List<User> userList) throws Exception {

        String[] read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Ceo.txt");
        String s = Arrays.toString(read);

        StringBuffer y = new StringBuffer(s);

        String t = y.delete(0, 1).toString();
        String q = y.delete(y.length() - 1, y.length()).toString();


        String[] split1 = q.split(",", q.length());
        String f1 = " ";
        int a = split1.length / 5;
        String[] f2 = new String[a];
        int count = 0;
        for (int j = 0; j < split1.length; j++) {
            int x = j / 5;
            if (j % 5 == 4) {
                f1 = f1.concat(split1[j]);
                f2[x] = f1;
                f1 = "";
                count = 0;

            } else {
                f1 = f1.concat(split1[j] + ",");
                count++;

            }

        }

        if (q.isEmpty()) {
            CeoService.createCeo();


        }

        return userList;

    }




}

