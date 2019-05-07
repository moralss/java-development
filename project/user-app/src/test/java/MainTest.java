import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Mock
    private Database db;
    @Mock
    private Connection c;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;

    private User user;

    @Before
    public void setUp() throws Exception {
        assertNotNull(db);
        when(c.prepareStatement(any(String.class))).thenReturn(stmt);
        when(db.connect()).thenReturn(c);

        user = new User("moral" , "jera");

        when(rs.first()).thenReturn(true);
        when(rs.getInt(1)).thenReturn(1);
        when(rs.getString(2)).thenReturn(user.getFirstName());
        when(rs.getString(3)).thenReturn(user.getSecondName());
        when(stmt.executeQuery()).thenReturn(rs);
    }



    @Test
    public void createPerson() {
        new UserRepository(db).saveUser(user);
    }

}





