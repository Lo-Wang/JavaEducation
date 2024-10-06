package ru.svechnikov.MySecondTestAppSpringBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import ru.svechnikov.MySecondTestAppSpringBoot.model.Request;
import ru.svechnikov.MySecondTestAppSpringBoot.model.Response;
import ru.svechnikov.MySecondTestAppSpringBoot.service.RequestService;

@RestController
@RequestMapping("/api")
public class MyController {

    private final RequestService requestService;

    // Внедрение зависимости через конструктор
    public MyController(RequestService requestService) {
        this.requestService = requestService;
    }

    // Обработка POST запроса
    @PostMapping(value = "/process", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Response> processRequest(@Valid @RequestBody Request request) {
        Response response = requestService.processRequest(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

