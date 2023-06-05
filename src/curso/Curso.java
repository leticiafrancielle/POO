package curso;

public class Curso {
	private int id;
	private String nome;
	private String duracao;
	private boolean forneceMaterial;
	private boolean gratuito;
	

	public Curso(int id, String nome, String duracao, boolean forneceMaterial, boolean gratuito) {
		super();
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.forneceMaterial = forneceMaterial;
		this.gratuito = gratuito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public boolean getForneceMaterial() {
		return forneceMaterial;
	}

	public void setForneceMaterial(boolean forneceMaterial) {
		this.forneceMaterial = forneceMaterial;
	}

	public boolean getGratuito() {
		return gratuito;
	}

	public void setGratuito(boolean gratuito) {
		this.gratuito = gratuito;
	}
	
	public void visualizar() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome do curso: " + this.nome);
		System.out.println("Duraçaõ: " + this.duracao);
		System.out.println("Fornece material?: " + this.forneceMaterial);
		System.out.println("É gratuito?: " + this.gratuito);
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * *");

	}
	
}