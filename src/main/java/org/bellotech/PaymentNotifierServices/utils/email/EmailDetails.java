package org.bellotech.PaymentNotifierServices.utils.email;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
    @Schema(name = "recipent", description = "abubakarmustapha264@outlook.com",example = "abubakarmustapha264@outlook.com")
    private String recipent = "abubakarmustapha264@outlook.com";
    @Schema(name = "msgBody",description="payment received", example="Body")
    private String msgBody="payment received";
    @Schema(name = "sublect", description = "payment comfirmation", example = "payment comfirmation" )
    private String subject  = "payment comfirmation";

}
