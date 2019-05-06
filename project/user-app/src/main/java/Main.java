import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scanner.next();

        System.out.println("enter last name");
        String secondName = scanner.next();

        User newUser = new User(firstName , secondName);
        Database db = new Database();

        UserRepository userRepository = new UserRepository(db);
        userRepository.saveUser(newUser);
        userRepository.findAll();
    }


}
