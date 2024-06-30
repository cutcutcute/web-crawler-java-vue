package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RunCrawlerTransfer {

    @JsonProperty(value = "init_url")
    private String initialUrl;
    @JsonProperty(value = "keywords")
    private List<String> keywords;
    @JsonProperty(value = "search_system")
    private SearchSystem searchSystem;

}
