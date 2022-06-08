package httpRequest;

import io.restassured.response.Response;
import lombok.*;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProUser extends Base{
    private String name;
    private String job;
    private String id;
    private String createdAt;

    private static final String usersURL = "api/users";
    private static final String postProUserRequest = "\n{" +
            "\"name\": \"Merbius\",\n" +
            "\"job\": \"leader\"\n}";

    public Response createProUser() {
        return getRequestSpecification().when().body(postProUserRequest)
                .post(usersURL);
    }
}
