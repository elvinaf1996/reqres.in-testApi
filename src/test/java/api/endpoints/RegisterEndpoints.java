package api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RegisterEndpoints {
    REGISTER("/register");

    private String url;
}
