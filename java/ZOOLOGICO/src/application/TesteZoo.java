package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguiça;

public class TesteZoo {
	public static void main(String[] args) {
		Cachorro bob = new Cachorro("Bob\n", 4, true, true);
		System.out.print(bob.getNome());
		System.out.println(bob.getIdade());
		System.out.println(bob.isEmiteSons());
		System.out.println(bob.isCorrer());

		Cavalo trovao = new Cavalo("Trovao\n", 10, true, true);
		System.out.print(trovao.getNome());
		System.out.println(trovao.getIdade());
		System.out.println(trovao.isEmiteSons());
		System.out.println(trovao.isCorrer());

		Preguiça edneide = new Preguiça("Edneide\n", 47, true, true);
		System.out.print(edneide.getNome());
		System.out.println(edneide.getIdade());
		System.out.println(edneide.isEmiteSons());
		System.out.println(edneide.isCorrer());

	}
}
