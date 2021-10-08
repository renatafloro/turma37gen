package entities;

public class Produto {

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", estoque=" + estoque + "]";
	}
	public String codigo;
	public String nomeProduto;
	public double valor;
	public int estoque=15;

	public void tirarEstoque(int quant) {
	            estoque-=quant;}
	public void addEstoque(int quant) {
		        estoque+=quant;}
	
}
