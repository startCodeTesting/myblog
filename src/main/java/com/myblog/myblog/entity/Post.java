package com.myblog.myblog.entity;

import jakarta.persistence.*;
import lombok.*;
// date-03/01

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "myblog")
@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
}
