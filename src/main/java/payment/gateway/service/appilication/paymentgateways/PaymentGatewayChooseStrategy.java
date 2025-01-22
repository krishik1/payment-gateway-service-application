package payment.gateway.service.appilication.paymentgateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooseStrategy {

    @Autowired
    private RazorPayPaymentGatewayImpl razorPayPaymentGateway;

    @Autowired
    private StripePaymentGatewayImpl stripePaymentGateway;

    public IPaymentGateWay getBestPaymentGateway() {
        return stripePaymentGateway;
    }


}
