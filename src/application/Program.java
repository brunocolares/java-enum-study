package application;

import java.time.Instant;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {	
	public static void main(String args[]) {
		Order order = new Order(1, Date.from(Instant.now()), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}
}
