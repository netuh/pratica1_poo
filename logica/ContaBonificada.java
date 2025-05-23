package logica;

public class ContaBonificada extends Conta {
  
  private double bonus;

  public ContaBonificada(){
    super();
    bonus = 0;
  }

  public void creditar(double valor) {
		bonus = valor * 0.1;
    super.creditar(valor);
	}

  public void rendeBonus(){
    super.creditar(bonus);
    bonus = 0;
  }
  
}
