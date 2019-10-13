package visao;

import modelo.NameFactory;
import modelo.Name;

public class Client {

	public static void main(String[] args) {
		
        NameFactory fabric = new NameFactory();
		
        Name n1 = fabric.getName("McNealy, Scott");
		System.out.println(n1.createName());
		
	Name n2 = fabric.getName("James Gosling");
		System.out.println(n2.createName());
		
	Name n3 = fabric.getName("Naughton, Patrick");
		System.out.println(n3.createName());
		
	}

}
