package api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UsersEndpoints {
    USER("/users/%s"),
    USERS("/users");

    private String url;
}
