package Entities;

public class ContaBancaria {
	private int numberCount;
	private String nameHolder;
	private double saldo;
	
	public int getNumberCount() {
		return numberCount;
	}
	
	public void setNumberCount(int numberCount) {
		this.numberCount = numberCount;
	}
	
	public String getNameHolder() {
		return nameHolder;
	}
	
	public void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numberCount, String nameHolder, double saldo){
		this.numberCount = numberCount;
		this.nameHolder = nameHolder;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numberCount, String nameHolder){
		this.numberCount = numberCount;
		this.nameHolder = nameHolder;
		saldo = 0;
	}
	
	public void sacar(double valor){
		if(saldo > valor){
			saldo -= valor;
		}else{
			System.out.println("Saldo Insuficiente!!");
		}
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	
	public String totring(){
		return "N�mero Account: " + numberCount + "\nName: " + nameHolder + "\nSaldo: " + saldo;
	}
	
	

}
