package Projeto;

public class AppProjeto {
	
public static void main(String[] args) {
		
		ErvaDaninha buva = new ErvaDaninha ("Buva", "Conyza", "Eudicotiled�nea", null);
		Herbicida glifosato = new Herbicida("Glifosato", "Amplo espectro", false, null);
		
		Herbicida_ErvaDaninha buva_glifosato = new Herbicida_ErvaDaninha(1, buva, glifosato);
		
		ItemUsu�rio guilherme = new ItemUsu�rio(1);
		ItemUsu�rio vini = new ItemUsu�rio(2);
		guilherme.cadastrarUsu�rio(new Usu�rio("Guilherme", "guilherme@gmail.com", "admin", "1234"));
		vini.cadastrarUsu�rio(new Usu�rio("Vinicius", "vinicius@gmail.com", "vini", "1234"));
	
		buva.apresentarHerbicida(buva, buva_glifosato);
		glifosato.apresentarHerbicidas(glifosato);
	}
}