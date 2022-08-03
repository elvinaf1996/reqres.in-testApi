package api.models.postLogin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class PostLogin {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
}
