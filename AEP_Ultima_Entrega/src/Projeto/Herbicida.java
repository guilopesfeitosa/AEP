package Projeto;

public class Herbicida {
	
	private String nome;
	private String grupoPertencente;
	private Boolean �Seletivo;
	private Imagens imagem;
	
	public Herbicida(String nome, String grupoPertencente, Boolean �Seletivo, Imagens imagem) {
		this.nome = nome;
		this.grupoPertencente = grupoPertencente;
		this.�Seletivo = �Seletivo;
		this.imagem = imagem;
	}
	
	public String getNome() {
		if(nome == null) {
			throw new RuntimeException ("Nome n�o pode ser nulo");
		}
		return nome;
	}
	
	public String getGrupoPertencente() {
		if (grupoPertencente == null) {
			throw new RuntimeException("Grupo pertencente n�o pode ser nulo");
		}
		return grupoPertencente;
	}
	
	public Boolean get�Seletivo() {
		return �Seletivo;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setGrupoPertencente(String grupoPertencente) {
		this.grupoPertencente = grupoPertencente;
	}

	public void set�Seletivo(Boolean �Seletivo) {
		this.�Seletivo = �Seletivo;
	}
	
	public void setImagem(Imagens imagem) {
		this.imagem = imagem;
	}
	
	public void apresentarHerbicidas(Herbicida herbicida) {
		System.out.println("================== HERBICIDAS ======================");
		System.out.println("Nome: " + herbicida.getNome());
		System.out.println("Grupo: " + herbicida.getGrupoPertencente());
		if(herbicida.get�Seletivo() == true) {
			System.out.println("Seletivo.");
		}
		else {
			System.out.println("N�o-Seletivo");
		}	
		System.out.println("Imagem: " + herbicida.getImagem());
	}
	
}
