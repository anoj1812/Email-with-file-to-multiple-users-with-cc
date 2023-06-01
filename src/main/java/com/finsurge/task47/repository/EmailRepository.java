package com.finsurge.task47.repository;

import com.finsurge.task47.entity.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository {
    private List<Email> list = new ArrayList<Email>();

    public void save(Email e) {
        Email email = new Email();
        email.setEmailTo(e.getEmailTo());
        email.setEmailSub(e.getEmailSub());
        email.setEmailmsg(e.getEmailmsg());
        email.setEmailFile(e.getEmailFile());
        email.setEmailCc(e.getEmailCc());
        email.setEmailBcc(e.getEmailBcc());
        list.add(0,email);
    }
    public Email getEmail() {
        return list.get(0);
    }
}

