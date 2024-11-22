package com.example.spring1031.Domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "studyuser")
public class Studyuser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer no;

    @Column(name = "name", length = 10, nullable = false)
    public String name;

    @Column(name = "id", length = 20, nullable = false)
    public String id;

    @Column(name = "pw", length = 30, nullable = false)
    public String pw;

    @Column(name = "email", length = 50, nullable = false)
    public String email;

    @Column(name = "joindate")
    @CreationTimestamp public LocalDateTime joindate;
}
