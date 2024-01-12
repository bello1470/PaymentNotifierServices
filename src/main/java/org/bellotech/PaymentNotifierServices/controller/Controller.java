package org.bellotech.PaymentNotifierServices.controller;

import org.bellotech.PaymentNotifierServices.services.EmailService;
import org.bellotech.PaymentNotifierServices.utils.email.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/mail")
public class Controller {

    @Autowired
    private EmailService emailService;

  

    @PostMapping("/send/{mail}")
    public String sendEmail(@PathVariable String mail, @RequestBody EmailDetails emailDetails ) {
      
      
        emailService.sendSimpleEmail(mail,emailDetails);
        return "Email sent successfully!";
    }
    
}
