package com.example.spring1031.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.spring1031.Dto.StudyuserDTO;
import com.example.spring1031.Repository.StudyuserRepository;

@Service
public class StudyuserService {
    
    @Autowired
    private StudyuserRepository studyuserRepository;
    public List<StudyuserDTO> getAllStudyuser(){
        return studyuserRepository.findAll().stream()
            .map(user -> StudyuserDTO.builder()
                .name(user.getName())
                .joindate(user.getJoindate())
                .build()
            )
            .collect(Collectors.toList());
    }
}
