package httpRequest;

import lombok.*;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProUser {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
