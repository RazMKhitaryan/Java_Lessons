import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import static java.util.Arrays.sort;


public class Main {


    public static void main(String[] args) throws Exception {

        // Methods.f(Methods.password);

        String[] read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson8\\src\\text.txt");


        String s = Arrays.toString(read);

        StringBuffer y = new StringBuffer(s);

        String t = y.delete(0, 1).toString();
        String q = y.delete(78, 79).toString();
        //  System.out.println(q);

        String[] split = q.split(",");
        String a = split[0];
        String b = split[1];
        String c = split[2];
        String d = split[3];
        String e = split[4];
        String f = split[5];
        String g = split[6];
        String h = split[7];
        String i = split[8];
        String j = split[9];
        String k = split[10];
        String l = split[11];
        String m = split[12];
        String n = split[13];
        String o = split[14];

        String hayk = "";
        hayk = hayk.concat(a + "," + b + "," + c + "," + d + "," + e);
        //    System.out.println(razmik);

        String ani = "";
        ani = ani.concat(f + "," + g + "," + h + "," + i + "," + j);
        //  System.out.println(artur);

        String karine = "";
        karine = karine.concat(k + "," + l + "," + m + "," + n + "," + o);
        //  System.out.println(serine);

        String[] haykArr = {a, b, c, d, e};
        String[] aniArr = {f, g, h, i, j};
        String[] karineArr = {k, l, m, n, o};

        String firstName1 = haykArr[0];
        String lastName1 = haykArr[1];
        int year1 = Integer.parseInt(haykArr[2]);
        char gender1 = haykArr[3].charAt(0);
        double mark1 = Double.parseDouble((haykArr[4]));

        String firstName2 = aniArr[0];
        String lastName2 = aniArr[1];
        int year2 = Integer.parseInt(aniArr[2]);
        char gender2 = aniArr[3].charAt(0);
        double mark2 = Double.parseDouble(aniArr[4]);

        String firstName3 = karineArr[0];
        String lastName3 = karineArr[1];
        int year3 = Integer.parseInt(karineArr[2]);
        char gender3 = karineArr[3].charAt(0);
        double mark3 = Double.parseDouble(karineArr[4]);

        Student s1 = new Student(firstName1, lastName1, year1, gender1, mark1);
        Student s2 = new Student(firstName2, lastName2, year2, gender2, mark2);
        Student s3 = new Student(firstName3, lastName3, year3, gender3, mark3);


        System.out.println("----------Task1---------");
        System.out.println();
        System.out.println(s1.getFirstName() + " " + s1.getLastName());
        System.out.println(s2.getFirstName() + " " + s2.getLastName());
        System.out.println(s3.getFirstName() + " " + s3.getLastName());
        System.out.println();


        System.out.println("----------Task2---------");
        System.out.println();

        if (s1.getGender() == 'm') {
            System.out.println(s1.getFirstName());
        }

        if (s2.getGender() == 'm') {
            System.out.println(s2.getFirstName());
        }


        if (s3.getGender() == 'm') {
            System.out.println(s3.getFirstName());
        }


        System.out.println();
        System.out.println("----------Task3---------");
        System.out.println();

        if (s1.getGender() == 'f' && s1.getMark() > 50.4) {
            System.out.println(s1.getFirstName());
        }

        if (s2.getGender() == 'f' && s2.getMark() > 50.4) {
            System.out.println(s2.getFirstName());
        }


        if (s3.getGender() == 'f' && s3.getMark() > 50.4) {
            System.out.println(s3.getFirstName());
        }

        System.out.println();
        System.out.println("----------Task4---------");
        System.out.println();

        double[] marksArr = {s1.getMark(), s2.getMark(), s3.getMark()};
        Student[] studentsArr = {s1, s2, s3};

        int pp = 0;
        double minMark = marksArr[0];
        for (int p = 1; p < studentsArr.length; p++) {
            if (studentsArr[p].getMark() < minMark) {
                minMark = studentsArr[p].getMark();
                pp = p;
            }

        }

        System.out.println(studentsArr[pp].getFirstName() + ", " +
                studentsArr[pp].getLastName() + ", " +
                studentsArr[pp].getYear() + ", " +
                studentsArr[pp].getGender() + ", " +
                studentsArr[pp].getMark());


        System.out.println();
        System.out.println("----------Task5---------");
        System.out.println();


        int maxYear = studentsArr[0].getYear();
        int index = 0;
        for (int p = 1; p < studentsArr.length; p++) {
            if (studentsArr[p].getGender() == 'm' && studentsArr[p].getYear() < maxYear) {

                maxYear = studentsArr[p].getYear();
                index = p;
            }


        }
        System.out.println(studentsArr[index].getFirstName() + ", " +
                studentsArr[index].getLastName() + ", " +
                studentsArr[index].getYear() + ", " +
                studentsArr[index].getGender() + ", " +
                studentsArr[index].getMark());


        System.out.println();
        System.out.println("----------Task6---------");
        System.out.println();


       Arrays.sort(marksArr);

     double[] newSort = marksArr;

//        if (newSort[0]< newSort[1] && newSort[0] < newSort[2] && newSort[1]<newSort[2]){
//            Student.printInfo(s2);
//            Student.printInfo(s1);
//            Student.printInfo(s3);
//        }



        double minMark2 = newSort[0];
        for (int p = 1; p < newSort.length; p++) {
            if ( minMark2 < newSort[p] && minMark2 < newSort[p+1] ) {
                minMark2 = newSort[p];
                Student.printInfo(s2);
                Student.printInfo(s1);
                Student.printInfo(s3);
                break;
            }
        }

        double minMark3 = newSort[1];
        for (int p = 2; p < newSort.length; p++) {
            if ( minMark2 < newSort[p] && minMark2 < newSort[p-2] ) {
                minMark2 = newSort[p];
                Student.printInfo(s1);
                Student.printInfo(s3);
                Student.printInfo(s2);
                break;
            }
        }

        double minMark4 = newSort[2];
        for (int p = 0; p < newSort.length-1; p++) {
            if ( minMark2 < newSort[p] &&  minMark2 < newSort[p+1]) {
                minMark2 = newSort[p];
                Student.printInfo(s3);
                Student.printInfo(s2);
                Student.printInfo(s1);
                break;
            }
        }

      //  System.out.println(marksArr[0] + "," + marksArr[1] + "," + marksArr[2]);

        System.out.println();
        System.out.println("----------Task7---------");


        int[] yearsArr = {s1.getYear(), s2.getYear(), s3.getYear()};
        sort(yearsArr);
        for (int p = 0; p < studentsArr.length; p++) {
            if (studentsArr[p].getGender() == 'f') {
                System.out.println(studentsArr[p].getFirstName());
            }
        }

        System.out.println("------------------------");
        Methods.f("hhhtttrrrUUoOOBB8887");


    }


}

