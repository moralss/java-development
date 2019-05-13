import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User {
    private Integer id;
    private String firstName;
    private String secondName;


    User(String firstName , String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
