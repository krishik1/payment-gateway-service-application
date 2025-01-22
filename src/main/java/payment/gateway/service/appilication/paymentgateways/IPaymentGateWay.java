package payment.gateway.service.appilication.paymentgateways;

public interface IPaymentGateWay {
    String getPaymentLink(Long amount,String orderId,String phoneNumber,String customerName);

}
