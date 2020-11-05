package com.example.lesson22.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Blog {

    private String createdBy;
    private String title;
    private String content;
}
