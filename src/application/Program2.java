package application;

import java.util.Scanner;

import entities.Equipamento;
import entities.enums.SituacaoEquipamento;

public class Program2 {

	public static void main(String[] args) {
		
		/* Testando o enum de SituacaoEquipamento com formulário */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do equipamento: ");
		String codigoEquipamento = sc.nextLine();
		System.out.println("Digite a tag do equipamento: ");
		String tagEquipamento = sc.nextLine();
		System.out.println("Escolha a situação atual do equipamento:");
		System.out.println("[1] Em Uso | [2] Fora de uso | [3] Em Manutenção | [4] Recusado");
		System.out.print("Digite o número:");
		Integer id = sc.nextInt();
		
		SituacaoEquipamento situacaoEquipamento = SituacaoEquipamento.fromId(id);
		Equipamento equipamento = new Equipamento(codigoEquipamento, tagEquipamento, situacaoEquipamento);
		System.out.println(equipamento);

	}

}
