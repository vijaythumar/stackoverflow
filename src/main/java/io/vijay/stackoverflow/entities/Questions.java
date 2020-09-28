package io.vijay.stackoverflow.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId ;

    @Column
    private String question;

    @Column
    private LocalDate askedDate = LocalDate.now();

    public Questions() {

    }

    public Questions(int questionId, String question, LocalDate askedDate) {
        this.questionId = questionId;
        this.question = question;
        this.askedDate = askedDate;
    }

    public Questions(String question) {
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public LocalDate getAskedDate() {
        return askedDate;
    }

    public void setAskedDate(LocalDate askedDate) {
        this.askedDate = askedDate;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", askedDate=" + askedDate +
                '}';
    }
}
