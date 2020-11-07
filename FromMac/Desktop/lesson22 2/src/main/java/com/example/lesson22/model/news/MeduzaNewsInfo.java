package com.example.lesson22.model.news;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeduzaNewsInfo {
private String url;
private String title;
@JsonProperty("published_at")
private Long publishedAt;
}
