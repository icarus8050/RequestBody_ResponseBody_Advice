package com.example.demo.controller;

import com.example.demo.controller.dto.Answer;
import com.example.demo.controller.dto.Question;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FooController {

    @PostMapping(value = "/foo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Answer foo(@RequestBody Question question) {
        Answer answer = new Answer();
        answer.setAnswerMessage("hello world!");
        answer.setLocalDateTime(LocalDateTime.now());
        return answer;
    }
}
