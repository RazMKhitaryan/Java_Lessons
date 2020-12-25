import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserValidation {
    public static String namevalidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Create  User----");
        System.out.println("----Input user's name surname----");
        System.out.println("----Example: Razmik Mkhitaryan ----");
        String name = scanner.next();
        String lastname = scanner.next();


        if (name.matches("[A-Z][a-z]+") && lastname.matches("[A-Z][a-z]+")) {
            return name + " " + lastname;
        } else {
            System.out.println("Wrong Input");
            return namevalidation();
        }


    }

    public static String emailValidation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----Input user's email----");
        System.out.println("----Example: namesurname@gmail.com----");
        String email = scanner.next();

        if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return email;
        } else {
            System.out.println("Wrong Input");
            return emailValidation();
        }
    }


    public static String usernameValidation(List<User> a) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----Input user's username----");
        System.out.println("----Example: name11Surname96----");
        String username = scanner.next();


        if (username.matches("^[A-Za-z0-9+_.-]+") && username.length() > 10) {

            for (int i = 0; i < a.size(); i++) {
               if(!(a.get(i).getUsername().equals(username))){
                   return username;
               }else{
                   System.out.println("Username is Busy");
                   usernameValidation(a);
               }
            }


            }

        System.out.println("Wrong Input");
        return usernameValidation(a);

    }


    public static String passwordValidation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----Input user's password----");
        System.out.println("----Example: 96RazMikMkHitaryan19----");
        String password = scanner.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                a++;
            }

            if (Character.isDigit(password.charAt(i))) {
                b++;
            }
        }
        if (a >= 2 && b >= 3) {

            return password;
        } else {
            System.out.println("Wrong Input");
            return passwordValidation();
        }
    }

    public static String Hash(String txt) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();

        } catch (java.security.NoSuchAlgorithmException e) {
            //error action
        }
        return null;
    }






}









