package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.User;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDataService service;

//
    @GetMapping("/users")
    public List<User> getUser() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id){
        return service.findOne(id);
    }


    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.saveUser(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }


    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable  int id){
        service.removeUser(id);
    }

}

