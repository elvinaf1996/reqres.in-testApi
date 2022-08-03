package api.models.dayOfCreateOrUpdate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chronology {
    @JsonProperty("id")
    String id;
    @JsonProperty("calendarType")
    String CalendarType;

}
