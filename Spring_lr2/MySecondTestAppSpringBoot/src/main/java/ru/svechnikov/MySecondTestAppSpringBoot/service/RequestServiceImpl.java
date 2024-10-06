package ru.svechnikov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

import ru.svechnikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.svechnikov.MySecondTestAppSpringBoot.model.Request;
import ru.svechnikov.MySecondTestAppSpringBoot.model.Response;

@Service
public class RequestServiceImpl implements RequestService {

    @Override
    public Response processRequest(Request request) {
        // Проверяем, если UID равен "123", выбрасываем исключение
        if ("123".equals(request.getUid())) {
            throw new UnsupportedCodeException("UID 123 не поддерживается");
        }

        // Если все ок, возвращаем успешный ответ
        Response response = new Response();
        response.setUid(request.getUid());
        response.setOperationUid(request.getOperationUid());
        response.setSystemTime(request.getSystemTime());
        response.setCode("success");
        return response;
    }
}


