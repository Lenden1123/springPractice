package com.example.spring1031.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring1031.Domain.Studyuser;
import com.example.spring1031.Repository.StudyuserRepository;

@Service
public class StudyuserService {
    
    @Autowired
    private StudyuserRepository studyuserRepository;
    public List<Studyuser> getAllStudyuser(){
        return studyuserRepository.findAll();
    }
}
