package io.vijay.stackoverflow.controller;

import io.vijay.stackoverflow.dao.QuestionDAO;
import io.vijay.stackoverflow.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @Autowired
    QuestionDAO questionDAO;

    @Autowired
    QuestionService questionService;

    @PostMapping("askQuestion")
    public String askQuestion(@RequestBody String question){
        questionService.saveQuestion(question);
        return question;
    }
}
