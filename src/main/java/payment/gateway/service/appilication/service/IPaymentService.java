package payment.gateway.service.appilication.service;

public interface IPaymentService {

    String generateLink(Long amount,String orderId,String phoneNumber,String customerName);
}
