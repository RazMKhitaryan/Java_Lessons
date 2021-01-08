package Service;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import MyWorkers.Ceo;
import MyWorkers.Worker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CeoService extends WorkerService implements CodeWriting, Languages{
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



    public static void createCeo(String language) {
        if (language=="true"){
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
                Files.write(Paths.get("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Ceo.txt"), gg.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            if (language == "true"){
                System.out.println("!!!INVALID INPUT!!!");}
            else{
                System.out.println("!!!Սխալ մուռքագրում!!!");
            }
            createCeo(language);
        }

        if (language == "true"){
            System.out.println("Please go previous page for Refresh");}
        else{
            System.out.println("Խնրում եմ վերադարձեք նախորդ էջ ցուցակը թարմացնելու համար");
        }
    }

    /**
     * From Ceo.txt file read and set Ceo members in ceoList
     * @param read
     * @return ceoList
     */


    public static List<Worker> setCeo(List<String> read, List<Worker> ceoList) {
        for (int j = 0; j < read.size(); j++) {
            ceoList.add(new Ceo(read.get(j)));

        }


      return ceoList;

   }




}

