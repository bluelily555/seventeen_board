package com.seventeen.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor(force = true)
public class User {
    @Id
    private String id;

    @NonNull
    private String pwd;
    @NonNull
    private String nickname;

    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;



}