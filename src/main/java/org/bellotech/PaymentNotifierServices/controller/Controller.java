package org.bellotech.PaymentNotifierServices.controller;

import org.bellotech.PaymentNotifierServices.services.EmailService;
import org.bellotech.PaymentNotifierServices.utils.email.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/mail")
public class Controller {

    @Autowired
    private EmailService emailService;

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailDetails emailDetails ) {
        String message = "Sent";
        EmailDetails emailDetails2 = new EmailDetails("abubakarmustapha264@outlook.com",message,"payment successfull");
        emailService.sendSimpleEmail(emailDetails2);
        return "Email sent successfully!";
    }
    
}
