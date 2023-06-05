package farmacia;

public class Farmacia {
	private int id;
	private String nome;
	private String endereco;
	private boolean estaAberto;
	private boolean produtoDisponivel;
	private int telefone;

	public Farmacia(int id, String nome, String endereco, boolean estaAberto, boolean produtoDisponivel, int telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.estaAberto = estaAberto;
		this.produtoDisponivel = produtoDisponivel;
		this.telefone = telefone;
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean getEstaAberto() {
		return estaAberto;
	}

	public void setEstaAberto(boolean estaAberto) {
		this.estaAberto = estaAberto;
	}

	public boolean getProdutoDisponivel() {
		return produtoDisponivel;
	}

	public void setProdutoDisponivel(boolean produtoDisponivel) {
		this.produtoDisponivel = produtoDisponivel;
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Está aberto?: " + this.estaAberto);
		System.out.println("O produto está diponível?: " + this.produtoDisponivel);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("\n*************************");

	}
}