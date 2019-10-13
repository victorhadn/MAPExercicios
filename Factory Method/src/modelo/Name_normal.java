package modelo;

public class Name_normal extends Name{

	private String divideName[] = new String[1];
	
	public Name_normal(String nome, String sobrenome) { 
		divideName =  nome.split(" ");
		this.nome = divideName[0];
		this.sobrenome = divideName[1];
	}
	
	public String createName() { 
		return divideName[0] + " " + divideName[1];
	}

}
