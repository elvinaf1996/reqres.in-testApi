package api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginEndpoints {
    LOGIN("/login");

    private String url;

}
