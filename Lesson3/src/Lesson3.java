
public class Lesson3 {
    public static void main(String[] args) {

        //Task 1 : Create an array and fill it with 2 number.

        System.out.println();
        System.out.print("----------------Task1---------------");
        System.out.println();


        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {

            array[i] = 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("----------------Task2---------------");
        System.out.println();
//----------------------------------------------


        // Task 2 : Create an array and fill it with numbers from 1:1000.

        int[] array2 = new int[1000];
        for (int i = 0, j = 1; i < array2.length; i++, j++) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.print("----------------Task3---------------");
        System.out.println();
////----------------------------------------------

        // Task 3 : Create an array and fill it with odd numbers from -20:20

        int[] array3 = new int[20];
        for (int i = 0, j = -19; i < array3.length; i++, j += 2) {
            array3[i] = j;

            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.print("----------------Task4---------------");
        System.out.println();
//----------------------------------------------

        //Task 4 : Create an array and fill it. Print all elements which can be divided by 5.

        int[] array4 = {2, 9, 8, 50, 0, 2, 3, 55, 75, 1, 2, 3, 6, 8, 9, 15, 60};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 5 == 0) {
                System.out.print(array4[i] + " ");
            }
        }
        System.out.println();
        System.out.print("----------------Task5---------------");
        System.out.println();
////----------------------------------------------

        //Task 5 : Create an array and fill it. Print all elements which are between 24.12 and 467.23
        double[] array5 = {26.32, 13.356, 500.236, 96.657, 32.458, 435.351};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > 24.12 && array5[i] < 467.23) {
                System.out.print(array5[i] + " ");
            }


        }
        System.out.println();
        System.out.print("----------------Task6---------------");
        System.out.println();
////----------------------------------------------

        //Task 6 : Create an array and fill it. Print count of elements which can be divided by 2

        int[] array6 = new int[10];
        int count = 0;
        for (int i = 0, j = 1; i < array6.length; i++, j++) {
            array6[i] = j;
            if (array6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count + " ");
        System.out.println();
        System.out.print("----------------Task7---------------");
        System.out.println();
////----------------------------------------------

        //Task 7 : Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        int n = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);

        }
        System.out.println();


    }


}



