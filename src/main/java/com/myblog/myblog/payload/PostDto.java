package com.myblog.myblog.payload;

import lombok.*;

//Date-04/01
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;


}
