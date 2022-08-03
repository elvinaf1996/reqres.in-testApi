package api.models.getUser;

import api.Support;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class GetUsers {
    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("total")
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("data")
    private ArrayList<UserData> data;
    @JsonProperty("support")
    private Support support;
}

