package condicional;

import java.util.Scanner;

public class AuxilioEmergencial {

    public static void main(String[] args) {
        Scanner leia =  new Scanner (System.in);

        final double AUXILIO=600.00; 
        final double VALORFILHO = 50.00;
        String nome;
        char chefaFamilia, pronome, outroAuxilio;
        int qtdFilhos;
        double auxilioChefa;

        System.out.print("Digite seu nome: ");
        nome = leia.next();
        System.out.print("Digite o pronome (A/O/E): ");
        pronome = leia.next().toUpperCase().charAt(0);

        System.out.print( "Voc� recebeu outro aux�lio? (S/N): ");
        outroAuxilio = leia.next().toUpperCase().charAt(0);

        if (outroAuxilio == 'S') {
            System.out.println("VOC� N�O TEM DIREITO AO AUX�LIO EMERGENCIAL!!!");

        }else if (outroAuxilio == 'N') {

            if(pronome == 'O' || pronome == 'E') {
                System.out.println("Ol� " + nome + " o valor a receber � de R$ " + AUXILIO);

                }
            else if (pronome == 'A'){
                System.out.print("Voc� � chefa de fam�lia (S/N): ");
                chefaFamilia = leia.next().toUpperCase().charAt(0);

                    if (chefaFamilia == 'S') {

                        System.out.print("Quantos filhos voc� tem? ");
                        qtdFilhos = leia.nextInt();

                        auxilioChefa = (AUXILIO *2) + (VALORFILHO * qtdFilhos);
                        System.out.println("Ol�, " + nome + " o valor a receber � de R$ " + auxilioChefa);

                        }
            }



    }

}
}