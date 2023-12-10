package com.uol.smqa.controller;

import com.uol.smqa.dtos.request.DiscountRequestDTO;
import com.uol.smqa.dtos.response.BaseApiResponseDTO;
import com.uol.smqa.dtos.response.PasswordResetResponseDto;
import com.uol.smqa.exceptions.AuthorizationException;
import com.uol.smqa.exceptions.BadRequestException;
import com.uol.smqa.exceptions.ResourceNotFoundException;
import com.uol.smqa.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static com.uol.smqa.utils.RequestValidatorUtil.getErrorMessages;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;


    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/apply-coupon")
    public ResponseEntity<?> applyCouponCode(@Validated @RequestBody DiscountRequestDTO discountRequestDTO, BindingResult bindingResult) throws Exception {

        try {
            if (bindingResult.hasErrors())  {
                return new ResponseEntity<>(new BaseApiResponseDTO("One or more validation errors occurred", null, getErrorMessages(bindingResult))
                        , HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(eventService.applyCouponCode(discountRequestDTO), HttpStatus.CREATED);
        } catch (ResourceNotFoundException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.NOT_FOUND);
        } catch (BadRequestException ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {
            return new ResponseEntity<>(new BaseApiResponseDTO(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}