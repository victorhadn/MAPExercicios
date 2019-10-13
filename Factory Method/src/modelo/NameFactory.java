package modelo;

public class NameFactory {
	
	public NameFactory() {}
	
	public Nome getNome (String nome) {
		
		if(nome.indexOf(",") > 0) {
			return new Name_inverted(nome, null);
		} else {
			return new Name_normal(nome, null);
		}
	}

}
