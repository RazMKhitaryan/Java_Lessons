
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class UserService {
    public static void createUser() throws Exception {
        String name = UserValidation.namevalidation();
        String email = UserValidation.emailValidation();
        String username = UserValidation.usernameValidation();
        String password = UserValidation.Hash(UserValidation.passwordValidation());

        String userInfo = name + "," + email + "," + username + "," + password + "\n";


        Files.write(Paths.get("base.txt"), userInfo.getBytes(), StandardOpenOption.APPEND);


    }


    public static void setUser(List<String>st, List<User> userList) throws Exception {
        String[] read = FileService.read("base.txt").toArray(new String[0]);
        String s = Arrays.toString(read);

        StringBuffer y = new StringBuffer(s);

        String t = y.delete(0, 1).toString();
        String q = y.delete(y.length() - 1, y.length()).toString();


        String[] split1 = q.split(",", q.length());
        String f1 = " ";
        int a = split1.length / 4;
        String[] f2 = new String[a];
        int count = 0;
        for (int j = 0; j < split1.length; j++) {
            int x = j / 4;
            if (j % 4 == 3) {
                f1 = f1.concat(split1[j]);
                f2[x] = f1;
                f1 = "";
                count = 0;

            } else {
                f1 = f1.concat(split1[j] + ",");
                count++;

            }

        }
        for (int i = 0; i < f2.length; i++) {
            st.add(i, f2[i]);
            userList.add(new User(st.get(i)));

        }


    }


    public static void logIn(String login, String password, List<User> o) throws Exception {
        String aa = null;
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getUsername().equals(login) && o.get(i).getPassword().equals(UserValidation.Hash(password))) {
                aa = "true";
            } else {


            }

        }
        if (aa != null) {
            System.out.println("Welcome");
            System.out.println();
            aa = null;
        } else {
            System.out.println("User not found");
        }
    }
}







