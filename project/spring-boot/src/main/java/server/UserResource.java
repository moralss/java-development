package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDataService service;


    @RequestMapping("/user")
    public List<User>  retrieveAllUsers(){
        List<User> users = service.findAll();

        try{
            return users;
        }catch (Exception e){
            System.out.println(e);
        }

        return users;

    }
}

