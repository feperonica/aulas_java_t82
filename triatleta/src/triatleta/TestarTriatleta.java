package triatleta;

public class TestarTriatleta {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta("João");
		
		t1.visualizar();
		
		t1.aquecer();
		t1.nadar();
		t1.pedalar();
		t1.correr();
		t1.cansou();
		
		JogadorFutebol jf1 = new JogadorFutebol("João");
		
		jf1.visualizar();
		
		jf1.aquecer();
		jf1.correr();
		jf1.cansou();

	}

}
