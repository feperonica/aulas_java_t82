package triatleta;


public class JogadorFutebol extends Pessoa implements Corredor{

	public JogadorFutebol(String nome) {
		super(nome);
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo no Gramado...");
		
	}

	@Override
	public void correr() {
		System.out.println("Jogando futebol...");
		
	}

	@Override
	public void cansou() {
		System.out.println("Fim do Jogo...");
		
	}
	
	

}
