
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserRepository implements DbContract{
    private Database db;

    UserRepository(Database db){
        this.db = db;
    }

    public void findAll(){
        String sql = "SELECT * FROM users";

        try{
            PreparedStatement st = db.connect().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                System.out.println("result " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }


    public void saveUser(User user){
        String SQL = "INSERT INTO users(name , surname) "
                + "VALUES(? , ?)";
        try{
            PreparedStatement pstmt = db.connect().prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, user.getFirstName());
                pstmt.setString(2, user.getSecondName());
                pstmt.executeUpdate();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
