package view;

public class Teste_voo {
	public static void main(String[] args) {
		
		
//***************************************************//
	Aeroporto porto = new Aeroporto();
	
	porto.Nome = "Força aérea 1";
	porto.tamanho = 9999;
	porto.localizacao = "Guarulhos";
	
	
	
    Aeronave aero = new Aeronave(porto.localizacao);
	
	aero.nome = "ALPHA1";
	aero.Modelo = "2927B";
	aero.Capacidade = 100;
	
	
	Passageiro passageiro = new Passageiro();
	
	passageiro.Nome ="Gabriel";
	passageiro.Qntd_Bagagem = 2;
	passageiro.nmr_assento = "7B";
	
	
	Piloto piloto = new Piloto(aero.nome);
	
	piloto.Nome = "BILL";
	piloto.identificacao = 252629;
	piloto.Uniforme = "Preto";
	
	
	passageiro.Viajar();
	porto.aeroporto();
	piloto.pilotar();
	aero.decolar();
	passageiro.comer();
	
	//***************************************************//
	System.out.println("\n");
	//***************************************************//
	
	
	
	
	
    Aeroporto Porto = new Aeroporto();
	
	Porto.Nome = "Força aérea 2";
	Porto.tamanho = 8888;
	Porto.localizacao = "São Paulo";
	
	
	
    Aeronave Aero = new Aeronave(Porto.localizacao);
	
	Aero.nome = "Beta";
	Aero.Modelo = "8978A";
	Aero.Capacidade = 150;
	
	
	Passageiro Passageiro = new Passageiro();
	
	Passageiro.Nome ="Piteco";
	Passageiro.Qntd_Bagagem = 4;
	Passageiro.nmr_assento = "20P";
	
	
	Piloto Piloto = new Piloto(Aero.nome);
	
	Piloto.Nome = "FI DO BILL";
	Piloto.identificacao = 78937;
	Piloto.Uniforme = "Azul escuro";
	
	
	Passageiro.Viajar();
	Porto.aeroporto();
	Piloto.pilotar();
	Aero.decolar();
	Passageiro.comer();
	
	
	}
}
