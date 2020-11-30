import FileService.FileService;
import Students.StudentService;

import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {


        Scanner sss = new Scanner(System.in);
        String[] read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson9.1.1\\src\\text.txt");



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


        if (q.isEmpty()){
            StudentService.createStudents();
            StudentService.createStudents();
            StudentService.createStudents();
        }

        boolean isMenuActive = true;
        while (isMenuActive) {




            System.out.println("------Menu------");

            System.out.println("1.Print all students");
            System.out.println("2.Print all male students");
            System.out.println("3.Print min mark of Students.Student");
            System.out.println("4.Print female student who has maximum mark");
            System.out.println("5.Print male students who  are old 21");
            System.out.println("6.Print female students who are old 21");
            System.out.println("7.Print female smallest student");
            System.out.println("8.Print male smallest student");
            System.out.println("9. Create new students");
            System.out.println("10. Exit");

            int command = sss.nextInt();
            switch (command) {


                case 1:
                    StudentService.printAllStudens(f2);

                    break;

                case 2:
                    StudentService.printAllMaleStudens(f2);
                    break;

                case 3:
                    StudentService.printMinMarkOfStudens(f2);

                    break;

                case 4:
                    StudentService.printFemaleStudentsMarks(f2);
                    break;

                case 5:
                    StudentService.printMaleStudentGreatThan21(f2);
                    break;


                case 6:
                    StudentService.printFemaleStudentGreatThan21(f2);

                    break;


                case 7:
                    StudentService.printFemaleSmallestStudent(f2);
                    break;
                case 8:
                    StudentService.printMaleSmallestStudent(f2);
                    break;

                case 9:
                    StudentService.createStudents();
                    break;

                case 10:

                    isMenuActive = false;
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("invalid command");
                    break;
            }

        }

    }
}









