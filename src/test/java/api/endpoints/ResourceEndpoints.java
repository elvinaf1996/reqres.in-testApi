package api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResourceEndpoints {
    RESOURCE("/unknown/%s"),
    RESOURCES("/unknown");

    private String url;
}