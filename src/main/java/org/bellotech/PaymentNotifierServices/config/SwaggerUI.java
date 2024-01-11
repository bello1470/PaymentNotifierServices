package org.bellotech.PaymentNotifierServices.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
// for view in the swagger
@OpenAPIDefinition(
     info =@Info(
        title = "MyProject API",
          version = "version 1.0",
          contact = @Contact(
            name = "bellotech", email = "abubakarbello264@gmail.com", url = "https://github.com/bello1470"
          ),
          license = @License(
            name="Apache 2.0", url="http://www.apache.org/licenses/LICENSE-2.0"
          ),
          termsOfService= "https://github.com/bello1470",
          description = "Payment Service Notifier by Mustapha"
 )
)
public class SwaggerUI {
    
}
