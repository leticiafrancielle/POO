package game;

public class Produto {
	
	private int id;
	private String nome;
	private String plataforma;
	private int quantidade;
	private double valor;
	
	public Produto(){}
	
	public Produto(int id, String nome, String plataforma, int quantidade, double valor) {
		
		this.id = id;
		this.nome = nome;
		this.plataforma = plataforma;
		this.quantidade = quantidade;
		this.valor = valor;
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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Valor: " + this.valor);
		System.out.println("\n*************************");
	}
}