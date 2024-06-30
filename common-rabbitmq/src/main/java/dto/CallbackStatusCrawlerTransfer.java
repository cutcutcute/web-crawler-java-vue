package dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CallbackStatusCrawlerTransfer implements CallbackTransfer {
    @JsonProperty(value = "is_enable")
    private Boolean isEnable;

    @JsonProperty(value = "message")
    private String message;

}
