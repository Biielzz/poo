package view;

public class Piloto extends Pessoa {
	String Nome;
	int identificacao;
	String Uniforme;
	private String nome;


	public Piloto(String nome) {
		this.nome = nome;
	}



	public void pilotar() {
		System.out.println("O Piloto " + this.Nome + ", está pilotando a aeronave "
				+ this.nome + ", com o numero de identificacao: " + this.identificacao 
				+ ", e um uniforme de cor " + this.Uniforme);
	}
	
	
		
}
