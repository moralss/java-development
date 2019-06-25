package user;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static List<User> users = new ArrayList<>();


    public static void saveUser(User user){
        users.add(user);
    }

    public static List<User> findAll() {
        return users;
    }


}
