
package api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Support {
    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;
}
