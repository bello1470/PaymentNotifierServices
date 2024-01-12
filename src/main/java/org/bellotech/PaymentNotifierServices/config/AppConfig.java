package org.bellotech.PaymentNotifierServices.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class AppConfig {

    @Value("${spring.mail.host}")
    private String mail_host;
    @Value("${spring.mail.port}")
    private String mail_port;

    
    @Value("${spring.mail.properties.mail.smtp.auth}")
    private String mail_properties_mail_smtp_auth;

    @Value("${spring.mail.properties.mail.smtp.startls.enable}")
    private String mai_properties_mail_smtp_startls_enable;

    @Value("${spring.mail.smtp.ssl.trust}")
    private String smtp_ssl_trust;

    @Value("${mail.transport.protocol}")
    private String mail_transport_Protocol;

    @Value("${spring.mail.username}")
    private String spring_mail_username;

    @Value("${spring.mail.password}")
    private String sprin_mail_passwrod;

    @Bean
    public JavaMailSender javaMailSender(){

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost(mail_host);
        mailSender.setPort(Integer.parseInt(mail_port));
        mailSender.setUsername(spring_mail_username);
        mailSender.setPassword(sprin_mail_passwrod);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", mail_transport_Protocol);
        props.put("mail.smtp.auth", mail_properties_mail_smtp_auth);
        props.put("mail.smtp.Starttls.enable", mai_properties_mail_smtp_startls_enable);
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.trust", smtp_ssl_trust );

        return mailSender;

    }
    
}
