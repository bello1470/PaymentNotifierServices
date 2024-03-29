package org.bellotech.PaymentNotifierServices.services;

import org.bellotech.PaymentNotifierServices.utils.email.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @org.springframework.beans.factory.annotation.Value("${spring.mail.username}")
    private String sender;

    public Boolean sendSimpleEmail(String mail, EmailDetails emailDetails){

        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            
            mailMessage.setFrom(sender);
            mailMessage.setTo(mail);
            mailMessage.setText(emailDetails.getMsgBody());
            mailMessage.setSubject(emailDetails.getSubject());

            javaMailSender.send(mailMessage);

            return true;
        } catch (Exception e) {
           return false;
        }
    }
    
}
