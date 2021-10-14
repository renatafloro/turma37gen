package entities;

public class ContaPoupanca extends Conta{
	private int diaAniversarioPoupanca;

	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public void correcao(int dataAtual) {

		if (dataAtual == this.diaAniversarioPoupanca) {
			super.credito((super.getSaldo()*0.005));
		}

	}
	

}