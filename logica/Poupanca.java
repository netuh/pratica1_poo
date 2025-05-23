package logica;

public class Poupanca extends Conta{

	public void rendeConta(){
		double d = super.getSaldo();
		d = d *0.01;
		super.creditar(d);
	}
}
