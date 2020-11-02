public class Lesson2 {
    public static void main(String[] args) {
        int a = 4, b = 5;
        System.out.println("Hello");
        String s = "Java Lesson 2";
        a = 2;
        System.out.println(s);
        System.out.println(s + ":" + a);

        int age;
        int _Age;
        int $a564;

        String fullName;
        int x = 4, y = 6;
        System.out.println(x + y);
        System.out.println(x * y);
        int z = y / x;
        System.out.println(z);
        int q = y % x;
        System.out.println(q);

        x = x + 1;
        System.out.println(x);
        ++x;
        System.out.println(x);
        y = x++;
        y++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 4;
        y = 7;
        z = x++ - --y;
        System.out.println(z--);
        System.out.println(++x);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        //-2;6;6;6;-3


        System.out.println(x != 6);
        System.out.println(x > 75);
        System.out.println(x < 75);
        System.out.println(x <= 75);
        System.out.println(x >= 75);

        boolean p = x >= 0 && x <= 10;
        System.out.println(p);

        System.out.println(x < 10 || x % 15 == 0);
        System.out.println(!(x < 10 || x % 15 == 0));

        x = 8;
        x = x + 2;
        x += 2;
        x = x % 4;
        x %= 4;


        int[] myArray = new int[5];
        myArray[0] = 7;
        System.out.println(myArray[1]);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        double[] doubleArray = {1.2, 32.4};
//        double[] doubleArray = new double[4];
//        doubleArray[0] = 1.2;
//        doubleArray[1] = 32.4;

        double[] doubleArray2 = new double[]{1.2, 32.4};
        short xx = 4;
        int[][] m = {{xx, 6}, {62, 44}};
        System.out.println(m[1][0]);

        x = -45;
        if (x > 0) {
            System.out.println("positive");

        } else {
            System.out.println(" Not positive");
        }

        int c;
        if (x > 0) {
            c = 0;
        } else {
            c = 1;
        }
        System.out.println(c);

        c = x > 0 ? 0 : 1;
        System.out.println(c);

        System.out.println(x > 0 ? "positive" : "not positive");

        if (x > 0) {
            System.out.println("positive");

        } else {

            if (x < 0) {
                System.out.println("negative");

            } else {
                System.out.println("zero");

            }
        }

        System.out.println(x > 0 ? "positive" : (x < 0 ? "negative" : "zero"));

        x = 2;
        if (x == 1) {
            System.out.println("mek");
        } else {
            if (x == 2) {
                System.out.println("erkus");
            } else {
                if (x == 3) {
                    System.out.println("ereq");
                } else {
                    System.out.println("meca");
                }
            }
        }

        x = 3;
        switch (x){
            case 1:
                System.out.println("mek");
                break;
            case 3:
                System.out.println("ereq");
                break;
            case 2:
                System.out.println("erkus");
                break;
            default:
                System.out.println("meca");
                break;
            case 4:
            case 5:
                System.out.println("normal");
                break;


        }





}
}
