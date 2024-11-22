package com.example.spring1031.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring1031.Service.StudyuserService;

@Controller
public class UserController {
    
    @Autowired
    private StudyuserService studyuserService;

    @GetMapping("/")
    public String main(Model model){
        var userArr = studyuserService.getAllStudyuser();
        model.addAttribute("userArr", userArr);
        return "main";
    }
}
