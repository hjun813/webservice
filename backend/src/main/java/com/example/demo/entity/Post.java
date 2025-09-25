package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    
    @Id
    @GeneratedValue
    Long seq;

    String title;

    String contents;

    String writer;

    LocalDateTime uploadDate;
}
