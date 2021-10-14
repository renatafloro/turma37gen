package entities;

public class Limite extends Conta {

	private double limite = 1_000;
	
	public Limite(int numero, String cpf) {
		super(numero, cpf);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	private void usarLimite(double limiteUsado) {
		this.limite -= limiteUsado;
	}
	
	@Override
	public double debito(double valorDebito) {
		if (valorDebito > this.getSaldo()) {
			double valorDebitoExcedente = valorDebito - this.getSaldo();
			super.debito(valorDebito - valorDebitoExcedente);
			this.usarLimite(valorDebitoExcedente);
		}else {
			super.debito(valorDebito);
		}
		
		return super.getSaldo();
	}
	
}
