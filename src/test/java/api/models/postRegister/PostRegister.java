package api.models.postRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PostRegister {
    @JsonProperty("id")
    private int id;
    @JsonProperty("token")
    private String token;
}
