package com.seventeen.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor(force = true)
public class Board {
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String title;
    @NonNull
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;


}
