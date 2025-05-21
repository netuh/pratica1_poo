package logica;

public class Poupanca extends Conta{

	public void rendeConta(){
		double d = this.getSaldo();
		d = d *0.01;
		creditar(d);
	}
}
