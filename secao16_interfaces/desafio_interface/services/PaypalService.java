package services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(Double amount) {
		// 2% de taxa de pagemento
		return amount * 0.02;			
	}

	@Override
	public double interest(Double amount, Integer months) {
		// 1% juro simples mensal
		return amount * 0.01 * months;
	}
	
}
