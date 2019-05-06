package server;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDataService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1 , "moral"));
    }

    public List<User> findAll(){
        return users;
    }


    public User save(User user){
        users.add(user);
        return user;
    }

}
