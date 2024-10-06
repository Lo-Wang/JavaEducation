package ru.svechnikov.MySecondTestAppSpringBoot.service;

import ru.svechnikov.MySecondTestAppSpringBoot.model.Request;
import ru.svechnikov.MySecondTestAppSpringBoot.model.Response;

public interface RequestService {
    Response processRequest(Request request);
}
