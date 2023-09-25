package com.cardonamaturana.assetms.exceptions.base;


import com.cardonamaturana.assetms.exceptions.response.ErrorResponse;
import com.mongodb.MongoWriteException;
import java.sql.Timestamp;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class BaseExeptionHandler {

  @ExceptionHandler(BaseException.class)
  public Mono<ResponseEntity<ErrorResponse>> errorHandler(BaseException ex) {
    return Mono.just(new ResponseEntity<>(ErrorResponse.builder()
        .status(ex.getStatus().value())
        .code(ex.getCode())
        .message(ex.getMessage())
        .date(ex.getDate().toString())
        .build(),
        HttpStatus.valueOf(ex.getStatus().value())));
  }

  @ExceptionHandler(MongoWriteException.class)
  protected Mono<ResponseEntity<ErrorResponse>> handleDuplicateKeyException(
      MongoWriteException ex) {
    String errorMessage = ex.getError().getMessage();
    log.error(
        String.format("Error : %s , al intentar escribir en Mondo DB", ex.getError().toString()));
    log.error(ex.getError().getMessage());
    errorMessage = ex.getError().getMessage();
    return Mono.just(new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.CONFLICT.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER.getCode())
        .message("Id o email no pueden duplicarse")
        .build(),
        HttpStatus.valueOf(HttpStatus.CONFLICT.value())));

  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Mono<ResponseEntity<ErrorResponse>> handleHttpMessageNotReadableException(
      HttpMessageNotReadableException ex) {

    return Mono.just(new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getCode())
        .message(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getMessage())
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value())));
  }


  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Mono<ResponseEntity<ErrorResponse>> handleMethodArgumentNotValid(
      MethodArgumentNotValidException ex) {
    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
        .map(fieldError -> fieldError.getDefaultMessage())
        .collect(Collectors.joining("; "));

    return Mono.just(new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER.getCode())
        .message(errorMessage)
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value())));

  }


  @ExceptionHandler(BindException.class)
  protected Mono<ResponseEntity<ErrorResponse>> handleBindException(BindException ex) {
    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
        .map(fieldError -> fieldError.getDefaultMessage().concat("\n"))
        .collect(Collectors.joining("; "));

    return Mono.just(new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getCode())
        .message(errorMessage)
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value())));
  }


}
