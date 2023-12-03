package com.uol.smqa.advice;

import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    protected ResponseEntity<Object> handleMissingServletRequestParameter(
            MissingServletRequestParameterException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {
        String error = "Required parameter '" + ex.getParameterName() + "' is not present.";
        log.error("{} {} {} {} {}", LocalDateTime.now(), status.value(), status.getReasonPhrase(), error, request.getDescription(false));

        return new ResponseEntity<>(BaseApiResponseDTO.builder()
                .message(error)
                .build(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

}

