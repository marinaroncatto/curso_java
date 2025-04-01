package application;

import java.util.Date;

import entities.Order_;
import entities.enums.OrderStat;

public class Program0101 {

	public static void main(String[] args) {
		// Enumerações
		
		Order_ order = new Order_(1080, new Date(), OrderStat.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStat os1 = OrderStat.DELIVERED;
		//convertendo string para enum
		OrderStat os2 = OrderStat.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
