
public class Lesson3 {
    public static void main(String[] args) {

        //Task 1 : Create an array and fill it with 2 number.

        System.out.println();
        System.out.print("----------------Task1---------------");
        System.out.println();



        int[] Array = new int[6];
        for (int i = 0; i <Array.length ; i++) {

            Array[i] = 2;
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        System.out.print("----------------Task2---------------");
        System.out.println();
//----------------------------------------------


        // Task 2 : Create an array and fill it with numbers from 1:1000.

        int[] Array2 = new int[1001];
        for (int i = 1; i < Array2.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("----------------Task3---------------");
        System.out.println();
//----------------------------------------------



        // Task 3 : Create an array and fill it with odd numbers from -20:20

        int[] Array3 = new int[20];
        for (int i = -19; i <= Array3.length; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.print("----------------Task4---------------");
        System.out.println();
//----------------------------------------------


        //Task 4 : Create an array and fill it. Print all elements which can be divided by 5.

        int[] Array4 = new int[30];
        for (int i = 0; i <= Array4.length; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        System.out.print("----------------Task5---------------");
        System.out.println();
//----------------------------------------------


        //Task 5 : Create an array and fill it. Print all elements which are between 24.12 and 467.23
        double[] Array5 = new double[468];
        for (double i = 24.12; i <= Array5.length; i = i + 0.01) {

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("----------------Task6---------------");
        System.out.println();
//----------------------------------------------


        //Task 6 : Create an array and fill it. Print count of elements which can be divided by 2

        int[] Array6 = new int[10];
        int count = 0;
        for (int i = 0; i <= Array6.length; i++) {

            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.print(count + " ");
        System.out.println();
        System.out.print("----------------Task7---------------");
        System.out.println();
//----------------------------------------------

        //Task 7 : Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        int n = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);

        }
        System.out.println();





    }


}



