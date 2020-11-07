package com.example.lesson22.model.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeduzaNews {
    @JsonProperty("has_next")
    private Boolean hasNext;
    private List<String> collection;
    @JsonProperty("_count")
    private Integer count;
    private List <MeduzaNewsInfo> documents;

    }
}
