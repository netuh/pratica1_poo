package logica;

class Conta {
	private double saldo;

	public Conta() {
		this.saldo = 0;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public boolean debitar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
