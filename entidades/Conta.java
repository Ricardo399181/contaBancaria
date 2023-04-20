package entidades;

public class Conta {

	
	private Integer numero;
	private String titular;
	private double saldo;
	
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, double depositoInicial) {
		
		this.numero = numero;
		this.titular = titular;
		Deposito(depositoInicial);
		
	}
	
public Conta(Integer numero, String titular) {
		
		this.numero = numero;
		this.titular = titular;
		
   }	
		
	public Integer getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void Deposito(double quantia) {
		saldo += quantia;
	}
	
	public void Saque(double quantia) {
		saldo -= quantia + 5.0;
	}

	
	public String toString() {
		return "Conta " + numero + ", titular: " + titular + ", saldo: $ " + String.format("%.2f", saldo);
	}
	
	
}


