package payment.gateway.service.appilication.config;

import com.razorpay.RazorpayClient;

import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentGatewayConfig {

    @Value("${razorpay.id}")
    private String razorPayId;

    @Value("${razorpay.secret}")
    private String razorPaySecret;

    @Bean
    public RazorpayClient getRazorpayClient() throws RazorpayException {
        return new RazorpayClient(razorPayId,razorPaySecret);
    }
}
