import dto.Person;
import httpRequest.Users;
import org.testng.annotations.BeforeTest;

public class UsersTest {

    private static Users usersTest;
    private static Person personTest;
    @BeforeTest
    public void setUsersTest(){
        usersTest = new Users();
    }

    @BeforeTest
    public void setPersonTest(){
        personTest = new Person();
    }


}
