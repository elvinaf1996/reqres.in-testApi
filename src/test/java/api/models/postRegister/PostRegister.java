package api.models.postRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class PostRegister {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;

}
