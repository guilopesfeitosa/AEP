package Projeto;

public class ErvaDaninha {
	
	private String nomeUsual;
	private String nomeCientifico;
	private String breveDescri��o;
	private Imagens imagem;

	public ErvaDaninha(String nomeUsual, String nomeCientifico, String breveDescri��o, Imagens imagem) {
		this.nomeUsual = nomeUsual;
		this.nomeCientifico = nomeCientifico;
		this.breveDescri��o = breveDescri��o;
		this.imagem = imagem;
	}
	
	public String getNomeUsual() {
		return nomeUsual;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	
	public String getBreveDescri��o() {
		return breveDescri��o;
	}
		
	public Imagens getImagem() {
		return imagem;
	}
	
	public void setNomeUsual(String nomeUsual) {
		this.nomeUsual = nomeUsual;
	}
	
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	
	public void setBreveDescri��o(String breveDescri��o) {
		this.breveDescri��o = breveDescri��o;
	}
	
	public void setImagem(Imagens imagem) {
		this.imagem = imagem;
	}
	
	public void apresentarHerbicida (ErvaDaninha ervaDaninha, Herbicida_ErvaDaninha relacao) {
		System.out.println("================== ERVAS DANINHAS ==================");
		System.out.println("Nome: " + ervaDaninha.getNomeUsual());
		System.out.println("Nome Cientifico: " + ervaDaninha.getNomeCientifico());
		System.out.println("Breve Descri��o: " + ervaDaninha.getBreveDescri��o());
		System.out.println("Herbicida Recomendado: " + relacao.getHerbicida().getNome());
	}
}

