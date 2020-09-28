package io.vijay.stackoverflow.service;

import io.vijay.stackoverflow.dao.QuestionDAO;
import io.vijay.stackoverflow.entities.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;

    public void saveQuestion(String question) {
        questionDAO.save(new Questions(question));
    }
}
