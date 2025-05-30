package triatleta;

public abstract class Pessoa {
	
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void cansou();
	
	public void visualizar() {
		System.out.println("\n*********************************");
		System.out.println("\nDados Atleta");
		System.out.println("\n*********************************");
		System.out.println("\nNome do atleta " + this.nome);
	}
}
