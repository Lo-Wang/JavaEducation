package ru.svechnikov.MySecondTestAppSpringBoot.exception;


public class UnsupportedCodeException extends RuntimeException {
    public UnsupportedCodeException(String message) {
        super(message);  // Передаем сообщение в родительский класс RuntimeException
    }
}
