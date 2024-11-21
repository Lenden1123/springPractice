package com.example.spring1031.Domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studyuser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer no;
    public String name;
    public String id;
    public String pw;
    public String email;
    @CreationTimestamp public LocalDateTime joindate;
}
