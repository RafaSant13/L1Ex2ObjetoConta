package view;

import model.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		cb.numeroConta = 101;
		cb.nome = "Paulo";
		cb.saldo = 2000;
		System.out.println(cb.realizaDeposito(200)); 
		System.out.println(cb.realizaSaque(400));
	}

}
