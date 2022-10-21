package view;

public class Aeronave {
	String Modelo;
	int Capacidade;
	String nome;
	private String localizacao;
	
	public Aeronave(String localizacao) {
		this.localizacao = localizacao;
	}

	public void decolar() {
		System.out.println("A aeronave " + this.nome + ", localizada no aeroporto de: "
				+ this.localizacao + ", esta decolando.");
	}
}
