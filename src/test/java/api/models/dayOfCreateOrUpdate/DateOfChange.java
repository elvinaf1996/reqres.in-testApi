package api.models.dayOfCreateOrUpdate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateOfChange {
    @JsonProperty("year")
    int year;
    @JsonProperty("month")
    String month;
    @JsonProperty("monthValue")
    int monthValue;
    @JsonProperty("dayOfMonth")
    int dauOfMonth;
    @JsonProperty("leapYear")
    boolean leapYear;
    @JsonProperty("dayOfWeek")
    String dayOfWeek;
    @JsonProperty("era")
    String era;
    @JsonProperty("dayOfYear")
    int dayOfYear;
    @JsonProperty("chronology")
    Chronology chronology;
}
