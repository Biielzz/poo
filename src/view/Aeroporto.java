package view;

public class Aeroporto {
	String Nome;
	int tamanho;
	String localizacao;
	

	public void aeroporto() {
		System.out.println("O aeroporto " + this.Nome + ", localizado em "
				+ this.localizacao + ", tem um"
				+ " tamanho de " + this.tamanho);
	}
}
