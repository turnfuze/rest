package httpRequest;

import io.restassured.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Users extends Base {

    private static final String usersURL = "api/users";
    private static final String postRequest = "{\n" +
            "    \"name\": \"morpheus\",\n" +
            "    \"job\": \"leader\"\n" +
            "}";


    public Response getUsers(String id) {
        return getRequestSpecification().when().get(usersURL + "/" + id);
    }


}
