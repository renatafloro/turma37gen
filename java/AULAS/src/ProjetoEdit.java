
public class ProjetoEdit {

public static void main(String[] args) {
	import java.util.Scanner;
	public class ProjetoEdit {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner leia = new Scanner(System.in);
			
			String[][] loja = {{"G4-1","Teclado", "40.0", "10", "0"}, 
								{"G4-2", "Mouse", "20.0", "10", "0"}, 
					            {"G4-3", "Cadeira", "500.0", "10", "0"},
					            {"G4-4", "Gabinetes", "400.0", "10", "0"},
					            {"G4-5", "Memoria ram", "45.0", "10", "0"},
					            {"G4-6", "Monitor", "600.0", "10", "0"},
					            {"G4-7", "Headset", "40.0", "10", "0"},
					            {"G4-8", "SuporteNote", "80.0", "10", "0"},
					            {"G4-9", "Mousepad", "10.0", "10", "0"},
					            {"G4-10", "Notebook", "2000.0", "10", "0"}};

	String desejo, codigoProduto, confirmaCompra = " ";
	boolean repete = true;
	int opcaoPagamento = 0;
	double quantidadeCompra, totalCompra, valorCompra, imposto, valor10Porcento, aumento15Porcento = 0.0;
	double quantidadeCompra, totalCompra=0.0, valorCompra, imposto, valor10Porcento, aumento15Porcento = 0.0;


	System.out.println("BEM VINDES A LOJA DEVSTORE");
     public static void main(String[] args) {
			codigoProduto = leia.next().toUpperCase();
			System.out.println("CODIGO     PRODUTO     VALOR     ESTOQUE");
			for (int linha=0;linha<10;linha++) {
				if(codigoProduto == loja[linha][0]) {
				if(codigoProduto.equals(loja[linha][0])) {
					System.out.println(loja[linha][0]+"   "+"\t"+ loja[linha][1]+"\t"+loja[linha][2]+"\t"+loja[linha][3]);
			}
     public static void main(String[] args) {
		for (int linha=0;linha<10;linha++) {
			if (codigoProduto == loja[linha][0]) {
				if (quantidadeCompra < Double.parseDouble(loja[linha][3])) { //falta mudar o tipo para comparar.
					loja[linha][4] = Double.valueOf(quantidadeCompra).doubleValue(); // falta convers�o
				//	loja[linha][4] //= Double.valueOf(quantidadeCompra).doubleValue(); // falta convers�o
				}
				else {
					System.out.println("N�o possui estoque suficiente.");
    
		}while(repete);
	}
	// parei na linha 116 portugol
	for (int linha=0;linha<10;linha++) {
		//valorCompra = tp.cadeia_para_real(loja[l][2]) * tp.cadeia_para_real(loja[l][4])
//falta ajeitar				//loja[l][3] = //tp.real_para_cadeia(tp.cadeia_para_real(loja[l][3]) - tp.cadeia_para_real(loja[l][4]))
				//totalCompra += valorCompra;
	}
	System.out.println("Valor total da compra "+totalCompra);
	imposto = totalCompra * 0.09;
	System.out.println("Ter�"+imposto+"em imposto sobre a compra ");
	valor10Porcento = totalCompra * 0.10;
	System.out.println("Caso o valor seja pago a vista ter�: "+valor10Porcento+" de desconto");
	System.out.println("Caso o valor seja pago no cart�o ter�: "+valor10Porcento+" de acrescimo");
	System.out.println("Caso o valor seja pago no cart�o em 2x ter�: "+aumento15Porcento+" de acrescimo");
	System.out.println("---------------------------------------------");
	System.out.print("Escolha uma das op��es de pagamento: 1- � vista, 2- Cart�o, 3-Tr�s vezes ");
	opcaoPagamento = leia.nextInt();

	while (repete) {
		if (opcaoPagamento == 1 || opcaoPagamento == 2 || opcaoPagamento == 3) {
			break;
			//falta colocar pra simular a nota
		}
		else {
			System.out.println("OP��O INV�LIDA! DIGITE UMA DAS 3 OP��ES!");
			opcaoPagamento = leia.nextInt();
		}
	}
	System.out.println("-----------------------------------------------------------");
	System.out.println("========================NOTA FISCAL========================");
	System.out.println("-----------------------------------------------------------");
	System.out.println("VALOR DA COMPRA SEM IMPOSTO: "+totalCompra);
	System.out.println("VALOR DA COMPRA COM IMPOSTO: "+(totalCompra+imposto));
	System.out.println("ITENS DA COMPRA: ");

	for (int linha=0;linha<10;linha++) {
		if (loja[linha][4] != "0") {
			System.out.println("PRODUTO: "+loja[linha][0]+ "PRE�O: "+loja[linha][1]+" QUANTIDADE COMPRADA: "+loja[linha][4]);
		}
	}
	System.out.println("----------------------------------------------------------");
	System.out.println("SELECIONAR FORMA DE PAGAMENTO: ");
	switch(opcaoPagamento) {
		case 1:
			System.out.println("FORMA SELECIONADA: ");
			System.out.println("PAGAMENTO � VISTA, DESCONTO DE 10%, VALOR FINAL: "+((totalCompra+imposto)-valor10Porcento));
			break;
		case 2:
			System.out.println("FORMA SELECIONADA:");
			System.out.println("PAGAMENTO NO CART�O, ACRESCIMO DE 10%, VALOR FINAL: "+((totalCompra+imposto)-valor10Porcento));
		case 3:
			System.out.println("FORMA SELECIONADA: ");
			System.out.println("PAGAMENTO NO CART�O EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: ");
			//FALTA AJEITAR mat.arredondar(((( totalCompra+imposto ) + aumento15Porcento ) / 2 ) , 2 )
			break;
	}
	System.out.println("-----------------------------------------------------------");
	System.out.println("OBRIGADO POR CONFIAR NA NOSSA LOJA!");

}

}
		