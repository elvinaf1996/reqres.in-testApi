
package api.models.getUser;

import api.Support;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GetUser {
    @JsonProperty("data")
    private UserData data;
    @JsonProperty("support")
    private Support support;

}
