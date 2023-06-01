package com.finsurge.task47.controller;

import com.finsurge.task47.entity.Email;
import com.finsurge.task47.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping(value = "/sendemail")
    public String sendEmail(@ModelAttribute Email email) throws AddressException, MessagingException, IOException {
        emailService.saveEmail(email);
        emailService.sendMail();
        return "Email sent " ;
    }
}

