package ru.svechnikov.MySecondTestAppSpringBoot.model;

import lombok.Data;

@Data
public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;
}
