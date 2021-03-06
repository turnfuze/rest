package httpRequest;

import io.restassured.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Persons extends Base {

    private static final String usersURL = "api/unknown";

    public Response getPerson(String id) {
        return getRequestSpecification().when().get(usersURL + "/" + id);
    }

    public Response createPerson() {
        return getRequestSpecification().when().body("").post();
    }

}

