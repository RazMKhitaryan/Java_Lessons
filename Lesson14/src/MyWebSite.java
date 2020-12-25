import java.io.IOException;
import java.util.*;

public class MyWebSite {
    public static void main(String[] args) throws Exception {


        boolean stop = true;
        while (stop) {
            System.out.println("Press 1. for Sign In");
            System.out.println("Press 2. for Create Account");
            System.out.println("Press 3. for Exit");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            List<String> st = new LinkedList<>();
            List<User> userList = new LinkedList<>();


            switch (command) {
                case 1:

                    System.out.println("Login");
                    String login = scanner.next();
                    System.out.println("Password");
                    String password = scanner.next();
                    List<User> userList1 = UserService.setUser(st, userList);
                    UserService.logIn(login, password, userList1);
                    break;
                case 2:
                    UserService.createUser(UserService.setUser(st, userList));
                    break;

                case 3:
                    stop = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("invalid input");
            }


        }


    }


}
