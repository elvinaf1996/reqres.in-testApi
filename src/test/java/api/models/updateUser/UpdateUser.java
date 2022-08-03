package api.models.updateUser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class UpdateUser {
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("updatedAt")
    private LocalDate updatedAt;

    public UpdateUser(String name, String job) {
        this.name = name;
        this.job = job;
        updatedAt = LocalDate.now();
    }
}
