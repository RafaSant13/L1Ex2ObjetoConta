package model;

public class ContaBancaria {
	
	public int numeroConta;
	public String nome;
	public double saldo;
    
	public ContaBancaria() {
		this.numeroConta = 0;
		this.nome = "";
		this.saldo = 0;
	}
	
	public double realizaDeposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double realizaSaque(double valor) {
		saldo = saldo - valor;
		return saldo;
	}

}
