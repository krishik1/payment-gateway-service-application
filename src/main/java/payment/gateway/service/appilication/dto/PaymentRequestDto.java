package payment.gateway.service.appilication.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentRequestDto {
    private Long amount;
    private String mobileNumber;
    private String accountNumber;
    private String orderId;
}
