package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program0101 {

	public static void main(String[] args) {
		// Enumerações
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		//1080, new Date(), OrderStatus.PENDING_PAYMENT
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		//convertendo string para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
