package programas;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		String times[]= {"SPORT", "SANTA CRUZ", "NAUTICO"};
		
		List <String> timesPE= new ArrayList <>();
		
		timesPE.add("SPORT");
		timesPE.add("NAUTICO");
		timesPE.add("SALGUEIRO");
		
		timesPE.add(1,"SANTA CRUZ");
		
		for (String nome: timesPE) {
			System.out.println(nome);
		}
	}

}
