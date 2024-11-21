package com.example.spring1031.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring1031.Domain.Studyuser;
import com.example.spring1031.Repository.StudyuserRepository;

@Controller
public class UserController {
    
    @Autowired
    private StudyuserRepository studyuserRepository;

    @GetMapping("/")
    public String main(Model model){
        List<Studyuser> userArr = studyuserRepository.findAll();
        model.addAttribute("userArr", userArr);
        return "main";
    }
}
