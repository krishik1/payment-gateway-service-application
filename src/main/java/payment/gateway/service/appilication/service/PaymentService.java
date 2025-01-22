package payment.gateway.service.appilication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import payment.gateway.service.appilication.paymentgateways.IPaymentGateWay;
import payment.gateway.service.appilication.paymentgateways.PaymentGatewayChooseStrategy;

@Service
public class PaymentService implements  IPaymentService{
    @Autowired
    private PaymentGatewayChooseStrategy paymentGatewayChooseStrategy;
    @Override
    public String generateLink(Long amount, String orderId, String phoneNumber, String customerName) {
        IPaymentGateWay paymentGateWay = paymentGatewayChooseStrategy.getBestPaymentGateway();
        return paymentGateWay.getPaymentLink(amount,orderId,phoneNumber,customerName);

    }
}
