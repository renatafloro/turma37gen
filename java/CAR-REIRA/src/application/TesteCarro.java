package application;

import entities.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1=new Carro("PEK-2025","Gol","VK");
        Carro carro2=new Carro("GOY-2433","Uno","Fiat");
        
        carro1.ligarCarro();
        carro1.andarCarro();
        System.out.println("marcha"+carro1.getMarcha()+" velocidade "+carro1.setVelocidade());
        carro1.subirMarcha();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println("marcha: "+carro1.getMarcha()+" velocidade "+carro1.setVelocidade());
		
	}

}
