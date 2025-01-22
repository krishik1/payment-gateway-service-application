package payment.gateway.service.appilication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import payment.gateway.service.appilication.dto.PaymentRequestDto;
import payment.gateway.service.appilication.service.IPaymentService;

@RestController
    @RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/generatePaymentLink")
    public String generatePaymentLink(@RequestBody PaymentRequestDto paymentRequestDto) {
        return paymentService.generateLink(paymentRequestDto.getAmount(),paymentRequestDto.getOrderId(),
                paymentRequestDto.getMobileNumber(),paymentRequestDto.getAccountNumber());
    }
}
