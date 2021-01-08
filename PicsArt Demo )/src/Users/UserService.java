package Users;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import static Users.FileService1.read;
public class UserService {
    /**
     * Function Create User
     * calling 4 functions from user validation, if validation is ok , the userInfo String is writing in UsersBase.txt
     * @param a
     */
    public static void createUser(List<User> a,String language){
        String name = UserValidation.nameValidation(language);
        String email = UserValidation.emailValidation(language);
        String username = UserValidation.usernameValidation(a,language);
        String password = UserValidation.Hash(UserValidation.passwordValidation(language));

        String userInfo = name + "," + email + "," + username + "," + password + "\n";


        try {
            Files.write(Paths.get("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\UsersBase.txt"), userInfo.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Set User
     * read information from file and create userList ,which indexes are users numbers
     * @param st
     * @param userList
     * @return userList
     */
    public static List<User> setUser(List<String> st, List<User> userList) {
        List<String> read = null;
        try {
            read = read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\UsersBase.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < read.size(); i++) {
            st.add(i, read.get(i));
            userList.add(new User(st.get(i)));

        }

        return userList;
    }

    /**
     * Login function
     * If in users base(List<User> o) the has login and passwords MD5 version login is ok
     * @param login
     * @param password
     * @param o
     * @return
     */
    public static boolean logIn(String login, String password, List<User> o,String language){
        String aa = null;
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).getUsername().equals(login) && o.get(i).getPassword().equals(UserValidation.Hash(password))) {
                aa = "true";
            } else {


            }

        }
        if (aa != null) {
            aa = null;
            return true;

        } else {
            if (language=="true"){
            System.out.println("User not found");}
            else{
                System.out.println("Օգտագործողի էջ գոյություն չունի");
            }
            return false;
        }


    }







}







