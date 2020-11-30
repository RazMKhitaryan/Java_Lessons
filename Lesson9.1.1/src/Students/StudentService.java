package Students;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class StudentService {
    //-------------------------1


    public static void printAllStudens(String[] o) {
        for (int i = 0; i < o.length; i++) {
            Student j1 = new Student(o[i]);


            System.out.println(j1.getFirstName() + " " + j1.getLastName());


        }


    }

    //--------------------------------2
    public static void printAllMaleStudens(String[] o) {
        for (int i = 0; i < o.length; i++) {
            Student j1 = new Student(o[i]);

            if (j1.getGender() == 'm') {
                System.out.println(j1.getFirstName() + " " + j1.getLastName());
            }


        }

    }

    //--------------------------------3
    public static void printMinMarkOfStudens(String[] o) {
        double minMark = 50;
        for (int i = 0; i < o.length; i++) {
            Student j1 = new Student(o[i]);

            if (j1.getMark() <= minMark) {
                minMark = j1.getMark();
                System.out.println(j1.getFirstName() + "," + minMark);
            }


        }

    }

    //----------------------------------4
    public static void printFemaleStudentsMarks(String[] o) {
        double max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Student j1 = new Student(o[i]);
            if (j1.getGender() == 'f') {
                if (max < j1.getMark()) {
                    max = j1.getMark();
                    maxName = j1.getFirstName();
                }
            }
        }
        System.out.println(maxName + ":" + max);

    }


    //-----------------------------------5
    public static void printMaleStudentGreatThan21(String[] o) {
        int x;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {
            Student j1 = new Student(o[i]);

            if (j1.getGender() == 'm' && 2000 > j1.getYear()) {
                x = 2021 - j1.getYear();
                System.out.println(j1.getFirstName() + ":" + x + " years old");
            }

        }
    }

    //--------------------------------------6
    public static void printFemaleStudentGreatThan21(String[] o) {
        int x;
        String maxName = "";

        for (int i = 0; i < o.length; i++) {
            Student j1 = new Student(o[i]);

            if (j1.getGender() == 'f' && 2000 > j1.getYear()) {
                x = 2021 - j1.getYear();
                System.out.println(j1.getFirstName() + ":" + x + " years old");
            }


        }

    }


//----------------------------------------7

    public static void printFemaleSmallestStudent(String[] o) {
        int max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Student j1 = new Student(o[i]);
            if (j1.getGender() == 'f') {
                if (max < j1.getYear()) {
                    max = j1.getYear();
                    maxName = j1.getFirstName();
                }
            }
        }
        System.out.println(maxName + ":" + max);
    }


    //--------------------------------------------8
    public static void printMaleSmallestStudent(String[] o) {
        int max = 0;
        String maxName = "";
        for (int i = 0; i < o.length; i++) {

            Student j1 = new Student(o[i]);
            if (j1.getGender() == 'm') {
                if (max < j1.getYear()) {
                    max = j1.getYear();
                    maxName = j1.getFirstName();
                }
            }
        }
        System.out.println(maxName + ":" + max);
    }


    //-----------------------------------9
    public static java.nio.file.Path createStudents() throws Exception {
        System.out.println("----Please input  person----");
        System.out.println("---INPUT FORM ---\n Example: name,lastname,year,m or f,mark(num)");

        Scanner scanner = new Scanner(System.in);
        System.out.println("----Create  Person");
        String firstPerson = scanner.nextLine();
        String gg = firstPerson + "\n";
        return Files.write(Paths.get("D:\\Desktop\\Lessons\\Lessons\\Lesson9.1.1\\src\\text.txt"), gg.getBytes(), StandardOpenOption.APPEND);
    }


}



