package com.uol.smqa.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.*;

@Service
public class EmailService {

    private final SesClient sesClient;

    @Autowired
    public EmailService(SesClient sesClient) {
        this.sesClient = sesClient;
    }

    public void sendEventNotification(String recipient, String eventName, String eventLocation, LocalDateTime eventTime) {
        String subject = " Seats Await! Your Golden Ticket for an exciting event is Ready for Grabs 🎫✨ ";
        String body = String.format("Event Name: %s\nEvent Location: %s\nEvent Time: %s", eventName, eventLocation, eventTime);

        SendEmailRequest request = SendEmailRequest.builder()
                .destination(Destination.builder().toAddresses(recipient).build())
                .message(Message.builder()
                        .subject(Content.builder().data(subject).build())
                        .body(Body.builder().text(Content.builder().data(body).build()).build())
                        .build())
                .source("patilshital49@gmail.com")  
                .build();

        try {
            sesClient.sendEmail(request);
            System.out.println("Email sent successfully to " + recipient);
        } catch (SesException e) {
            System.err.println("Error sending email to " + recipient + ": " + e.getMessage());
        }
    }
}
