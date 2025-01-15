package application;

import java.util.Date;

import entities.Equipamento;
import entities.Order;
import entities.enums.DiaDaSemana;
import entities.enums.Moeda;
import entities.enums.OrderStatus;
import entities.enums.SituacaoEquipamento;

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
		
		/* Testes enum com situação do Equipamento */
		
		SituacaoEquipamento situacaoEquipamento = SituacaoEquipamento.EM_USO;
		Equipamento equipamento = new Equipamento("5189156", "TRA.092", situacaoEquipamento);
		
		String situacaoDesejada = "RECUSADO";
		Equipamento equipamento2 = new Equipamento("2341841", "CHA.077", SituacaoEquipamento.valueOf(situacaoDesejada));
		System.out.println("Equipamento 1: "+equipamento);
		System.out.println("Equipamento 2: "+equipamento2);
		
	}
}
