

import dto.PersonDetails;
        import dto.UserDetails;
        import httpRequest.Persons;
        import httpRequest.ProUser;
        import httpRequest.Users;
        import io.restassured.path.json.JsonPath;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;

        import static org.testng.Assert.assertEquals;


public class UserDetailsTest {
    private static Users usersTest;
    private static Persons personTest;


    @BeforeTest
    public void setUsersTest() {
        usersTest = new Users();
    }

    @BeforeTest
    public void setPersonTest() {
        personTest = new Persons();
    }

    @Test
    public void getUserDetails() {
        UserDetails userDetails = new UserDetails(TestData.user, TestData.support);
        UserDetails actual = usersTest.getUsers(Integer.toString(TestData.user.getId()))
                .then()
                .extract()
                .as(UserDetails.class);

        assertEquals(actual, userDetails);
    }

    @Test
    public void getSingleResource() {
        PersonDetails personDetails = new PersonDetails(TestData.person, TestData.support);
        PersonDetails actual = personTest.getPerson(Integer.toString(TestData.person.getId()))
                .then()
                .extract()
                .as(PersonDetails.class);

        assertEquals(actual, personDetails);
    }

    @Test
    public void createUser() {
        ProUser expected = new ProUser("Merbius", "leader", "955", "2022-06-05T15:31:38.233Z");
        ProUser actual = usersTest.createUser(expected)
                .then()
                .extract()
                .as(ProUser.class);
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getJob(), actual.getJob());
    }

    @Test
    public void checkResponseCode() {
        JsonPath retrievedBlogList = personTest.createPerson()
                .then()
                .statusCode(404)
                .extract().jsonPath();
    }

    @Test
    public void deleteUser(){

    }
}