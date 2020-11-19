package main;

import model.Student;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 7, 89, 63, 258, 745, 3, 23, 6,};
        int max = a[0];
        int min = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
                index = i;
            }


        }
        System.out.println("---------index of min--------- ");
        System.out.println(index);

        System.out.println("---------min and max numbers---------");
        System.out.println();


        System.out.println("max: " + max + " " + "min: " + min);
        System.out.println();


        //bubble sort

        System.out.println("---------Bubble Sort---------");
        System.out.println();


        int[] b = {89, 63, 7, 258, 5, 745, 3, 23, 6,};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int sort = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = sort;
                }
            }

        }

        for (int j : b) {
            System.out.print(j + " ");
        }


        System.out.println();


        Student s1 = new Student();
        s1.setFirstName("Razmik");
        s1.setLastName("Mkhitaryan");
        s1.setYear(1996);
        s1.setGender('m');
        s1.setMark(58.35);
        s1.setArmenian(true);


        Student s2 = new Student();
        s2.setFirstName("Kristi");
        s2.setLastName("Sahradyan");
        s2.setYear(1998);
        s2.setGender('f');
        s2.setMark(88.75);
        s2.setArmenian(true);


        System.out.println();


        System.out.println("---------Function---------");

        int y = s1.sum(8, 45);
        System.out.println(y);


        System.out.println(s1.sum(s1.getYear(), s2.getYear()));
        System.out.println("---------Students Info---------");
        s1.printInfo();
        s2.printInfo();

    }


}
