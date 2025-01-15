package application;

import java.util.Date;

import entities.Order;
import entities.enums.DiaDaSemana;
import entities.enums.Moeda;
import entities.enums.OrderStatus;

public class Program {	
	public static void main(String args[]) {
		/* Testes do enum de pedidos */
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		OrderStatus orderStatus = OrderStatus.valueOf("SHIPPED");
		System.out.println(order);
		System.out.println("orderStatus: "+orderStatus);
		
		/* Testes do enum de dia da semana semana */
		for(DiaDaSemana diaDaSemana : DiaDaSemana.values()) {
			System.out.println(diaDaSemana + "=" + diaDaSemana.getNumeroDoDia());
		}	
		
		/* Testes enum da moeda */
		Moeda moeda = Moeda.DOLAR;
		System.out.println(moeda.converter(100));
	}
}
