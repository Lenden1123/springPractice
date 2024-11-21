package com.example.spring1031.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring1031.Domain.Studyuser;

public interface StudyuserRepository extends JpaRepository<Studyuser, Integer> {
    
}
