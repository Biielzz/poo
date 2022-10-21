package view;

public class Passageiro extends Pessoa{

	String Nomee;
	int Qntd_Bagagem;
	String nmr_assento;
	
	
	public void Viajar() {
	 System.out.println("O passageiro " + this.Nome + ", esta viajando com " 
			 + this.Qntd_Bagagem + " bagagens, sentado no assento " 
			 + this.nmr_assento);
	}
}
