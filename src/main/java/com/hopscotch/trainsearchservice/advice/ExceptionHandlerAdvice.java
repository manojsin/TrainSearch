package com.hopscotch.trainsearchservice.advice;
import com.hopscotch.trainsearchservice.exception.ExceptionResponse;
import com.hopscotch.trainsearchservice.utils.CommonConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleException(Exception e){
        ExceptionResponse response = new ExceptionResponse(CommonConstants.INTERNAL_SERVER_ERROR_MSG, CommonConstants.INTERNAL_SERVER_ERROR_CODE);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
