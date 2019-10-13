package visao;

import modelo.FactoryAbstractHello;
import modelo.FactoryHello;

public class Client {

	public static void main(String[] args) {
		
		FactoryAbstractHello factory = new FactoryHello();

        double option = Math.random();



        if (option > 0.5) {
        	factory.createHelloVisor();
        	System.out.println("Escrito na tela.");
        }
        	
        if (option <= 0.5) {
        	factory.createHelloDocument();
        	System.out.println("Escrito no arquivo.");
        }

	}

}
