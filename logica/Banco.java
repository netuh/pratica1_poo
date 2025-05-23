package logica;

public class Banco {

  private String nomeBanco;
	private Conta[] contas;
	private int contadorDeContas;
	
	public Banco(String nome) {
		nomeBanco = nome;
    contas = new Conta[100];
		contadorDeContas = 0;
	}

	public int criarConta(){
		contas[contadorDeContas] = new Conta();
		int aux = contadorDeContas;
		contadorDeContas++;
		return aux;
	}

	public int criarPoupanca (){
		contas[contadorDeContas] = new Poupanca();
		int aux = contadorDeContas;
		contadorDeContas++;
		return aux;
	}

	public int criarContaBonificada() {
		contas[contadorDeContas] = new ContaBonificada();
		int aux = contadorDeContas;
		contadorDeContas++;
		return aux;
	}

	public String getNome() {
    return nomeBanco;
  }

	public boolean debitaConta(int idConta, double valor) {
		if (idConta < contadorDeContas) {
			return contas[idConta].debitar(valor);
		} else {
			return false;
		}
	}
	
	public void creditaConta(int idConta, double valor) {
		if (idConta < contadorDeContas) {
			contas[idConta].creditar(valor);
		}
	}

	public double getSaldo(int idConta) {
		if (idConta < contadorDeContas) {
			return contas[idConta].getSaldo();
		}
		return -1;
	}

	public void rendePoupanca(int idConta){
		if (idConta < contadorDeContas) {
			if (contas[idConta] instanceof Poupanca){
				Poupanca p = (Poupanca)contas[idConta];
				p.rendeConta();
			}
		}
	}

  public void rendeBonus(int idConta) {
    if (idConta < contadorDeContas) {
			if (contas[idConta] instanceof ContaBonificada){
				ContaBonificada c = (ContaBonificada)contas[idConta];
				c.rendeBonus();
			}
		}
  }
}
