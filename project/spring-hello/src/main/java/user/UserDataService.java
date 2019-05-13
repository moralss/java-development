package user;

import org.springframework.stereotype.Component;
import user.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDataService {
    private static List<User> users = new ArrayList<>();


    static {
        users.add(new User(1, "moral"));
        users.add(new User(4, "jera"));
    }


    public static List<User> findAll() {
        return users;
    }

    public static User findOne(int id) {
        for(User user : users){
            if(user.getId() == id) return user;
        }

        return null;
    }


    public static void saveUser(User user){
        users.add(user);
    }


    public static  void updateUser(User userInfo){
        for(User user : users){
            if(user.getId() == userInfo.getId()){
                int userIndex = users.indexOf(user);
                users.set(userIndex , userInfo);
            }
        }
    }

    public static void removeUser(int id) {
        Iterator <User> itr = users.iterator();
        while (itr.hasNext())
        {
            User user = itr.next();
            if (user.getId() == id) itr.remove();
        }
    }
}