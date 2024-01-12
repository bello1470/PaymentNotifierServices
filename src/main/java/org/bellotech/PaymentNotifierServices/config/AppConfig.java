package org.bellotech.PaymentNotifierServices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class AppConfig {

    @Value("${pring.mail.host}")
    private String mail_host;
    @Value("${spring.mail.port}")
    private int mail_port;

    
    @Value("${spring.mail.properties.mail.smtp.auth}")
    private String mail_properties_mail_smtp_auth;

    @Value("${spring.mail.properties.mail.smtp.startls.enable}")
    private String _mai_properties_mail_smtp_startls_enable;

    @Value("${spring.mail.smtp.ssl.trust}")
    private String smtp_ssl_trust;

    @Value("${mail.transport.protocol}")
    private String mail_transport_Protocol;

    @Value("${Spring.mail.username}")
    private String spring_mail_username;

    @Value("${spring.mail.password}")
    private String sprin_mail_passwrod;

    @Bean
    public JavaMailSender javaMailSender(){

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    }
    
}
