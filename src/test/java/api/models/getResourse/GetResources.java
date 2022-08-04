package api.models.getResourse;

import api.Support;
import api.models.getUser.UserData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResources {

    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("total")
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("data")
    private ArrayList<ResourceData> data;
    @JsonProperty("support")
    private Support support;

}
