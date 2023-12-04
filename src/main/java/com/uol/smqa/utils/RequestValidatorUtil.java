package com.uol.smqa.utils;

import org.apache.logging.log4j.util.Strings;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

public class RequestValidatorUtil {


    public static List<String> getErrorMessages(BindingResult bindingResult) {
        List<String> errorMessages = new ArrayList<>();
        for (ObjectError error: bindingResult.getAllErrors()) {
            String fieldError =  error.getDefaultMessage();

            if (Strings.isBlank(fieldError)) continue;
            errorMessages.add(fieldError);
        }
        return errorMessages;
    }
}
