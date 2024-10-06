package ru.svechnikov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Request {

    @NotBlank(message = "UID не может быть пустым")
    private String uid;

    @NotBlank(message = "Operation UID не может быть пустым")
    private String operationUid;

    private String systemName;

    @NotBlank(message = "System Time не может быть пустым")
    private String systemTime;

    @Min(value = 1, message = "Communication ID должен быть больше 0")
    @Max(value = 100000, message = "Communication ID должен быть меньше 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;
}
