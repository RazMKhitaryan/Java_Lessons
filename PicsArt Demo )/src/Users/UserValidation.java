package Users;

import java.util.List;
import java.util.Scanner;

/***
 *UserValidation class , for registration functions, all functions are static.
 *
 */


public class UserValidation {
//----------------------------------------------------
    /**
     * Name Validation
     * @return name + lastname of user or "wrong input"
     */

    public static String nameValidation(String language) {
        Scanner scanner = new Scanner(System.in);
        if (language=="true"){
        System.out.println("----Create  User----");
        System.out.println("----Input user's name surname----");
        System.out.println("First letter of name and surname must be uppercase  ");
        System.out.println("----Example: Razmik Mkhitaryan ----");}
        else{
            System.out.println("----Ստեղծել անձնական էջ----");
            System.out.println("----Մուտքագրել անուն ազգանուն----");
            System.out.println("----Անունը և ազգանունը պետք է սկսվեն մեծատառով----");
            System.out.println("----Օրինակ: Razmik Mkhitaryan----");
        }
        String name = scanner.next();
        String lastname = scanner.next();


        if (name.matches("[A-Z][a-z]+") && lastname.matches("[A-Z][a-z]+")) {
            return name + " " + lastname;
        } else {
            System.out.println("Wrong Input");
            return nameValidation(language);
        }


    }
//--------------------------------------------------------
    /**
     * Email Validation
     * @return email of user or "wrong input"
     */


    public static String emailValidation(String language) {
        Scanner scanner = new Scanner(System.in);
        if (language=="true"){
        System.out.println("----Input user's email----");
        System.out.println("----Example: namesurname@gmail.com----");}
        else{
            System.out.println("----Մուտքագրել մեյլ----");
            System.out.println("Օրինակ:namesurname@gmail.com");
        }
        String email = scanner.next();

        if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return email;
        } else {
            System.out.println("Wrong Input");
            return emailValidation(language);
        }
    }

//--------------------------------------------------------------

    /**
     * Username Validation
     * Username must consist of numbers and letters, if the username is busy than return is "username is busy"
     * @param a
     * @return username of user, or "username is busy"
     */
    public static String usernameValidation(List<User> a,String language) {

        Scanner scanner = new Scanner(System.in);
        if (language=="true"){
        System.out.println("----Input user's username----");
        System.out.println("username LENGTH must be > 10");
        System.out.println("----Example: name11Surname96----");}
        else{
            System.out.println("----Մուտքագրել օգտագործողի մուտքանուն ----");
            System.out.println("Մուտքանունը պետք է մեծ լինի 10-ից");
            System.out.println("----Օրինակ: name11Surname96----");
        }
        String username = scanner.next();


        if (username.matches("^[A-Za-z0-9_+]+") && username.length() > 10) {
            String aa = null;

            for (int i = 0; i < a.size(); i++) {

                if (!(a.get(i).getUsername().equals(username))) {
                    aa = "";
                    continue;
                } else {
                    aa = null;
                    break;


                }
            }

            if (aa != null) {
                aa = null;
                return username;
            } else {
                if (language=="true"){
                System.out.println("Username is Busy");}
                else{
                    System.out.println("Մուտքանունը զբաղված է");
                }
                usernameValidation(a,language);
            }


        }
        if (language=="true"){
        System.out.println("Wrong Input");}
        else{
            System.out.println("Սխալ մուտքագրում");
        }
        return usernameValidation(a,language);

    }

//--------------------------------------------------
    /**
     * Password Validation
     * Password must have 2 or more uppercase , and 3 or more numbers
     * @return password  of user, or "wrong input"
     */
    public static String passwordValidation(String language) {

        Scanner scanner = new Scanner(System.in);
        if (language=="true"){
        System.out.println("----Input user's password----");
        System.out.println("Password must have TWO UPPERCASE , FOUR NUMBERS and LENGTH >=8 ");
        System.out.println("----Example: 96RazMikMkHitaryan19----");}
        else{
            System.out.println("----Մետքագրեք օգտագործողի գաղտնաբառ----");
            System.out.println("Գաղտնաբառը պետք է պարունակի 2 մեծատառ և ավելի , նվազագույնը 4 թվանշան , և լինի 8-ից ավելի");
            System.out.println("----Օրինակ: 96RazMikMkHitaryan19----");
        }
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
        if (a >= 2 && b >= 3 && password.length()>=8) {

            return password;
        } else {
            if (language=="true"){
            System.out.println("Wrong Input");}
            else{
                System.out.println("Սխալ մուտքագրում");
            }
            return passwordValidation(language);
        }
    }
//-------------------------------------------------------------
    /**
     * MD5 compilation
     * @return compiled password or null
     */

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









