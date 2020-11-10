package com.example.demo.controller.dto;

import java.time.LocalDateTime;

public class Question {
    private String questionMessage;
    private LocalDateTime localDateTime;

    public String getQuestionMessage() {
        return questionMessage;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setQuestionMessage(String questionMessage) {
        this.questionMessage = questionMessage;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
