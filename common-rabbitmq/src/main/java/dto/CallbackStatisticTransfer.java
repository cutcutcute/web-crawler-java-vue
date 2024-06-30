package dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CallbackStatisticTransfer implements CallbackTransfer {

    @JsonProperty(value = "base_url")
    private String baseUrl;

    @JsonProperty(value = "children_urls")
    private List<String> childrenUrls;

}
