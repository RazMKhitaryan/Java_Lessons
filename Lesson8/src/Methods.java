import java.util.Arrays;

public class Methods {
    public static String password = "asas9aAABK8741 , asdasdfds, dsfskdjhjhj";
    ;


    public static void f(String password) throws Exception {
        if (password.length() <= 8) {
            System.out.println("Not strong");
            return;
        }
        int countNum = 0;
        char upCase = 0;


        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                countNum++;
            } else {
                if (Character.isUpperCase(c)) {
                    upCase++;

                }
            }


        }
        if (countNum >= 3 && upCase >= 2) {
            System.out.println("Strong");
        } else {
            System.out.println("not strong");
        }
    }


}