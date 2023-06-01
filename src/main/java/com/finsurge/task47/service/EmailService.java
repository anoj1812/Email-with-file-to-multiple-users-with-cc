package com.finsurge.task47.service;

import jakarta.mail.AuthenticationFailedException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.finsurge.task47.entity.Email;

import java.io.IOException;

public interface EmailService  {

    public void saveEmail(Email email);
    public void sendMail() throws AddressException, MessagingException, IOException, AuthenticationFailedException;
}

