package com.example.demo.controller.dto;

import java.time.LocalDateTime;

public class Answer {
    private String answerMessage;
    private LocalDateTime localDateTime;

    public String getAnswerMessage() {
        return answerMessage;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setAnswerMessage(String answerMessage) {
        this.answerMessage = answerMessage;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
