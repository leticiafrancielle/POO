package cliente;

public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private int idade;
	private int rg;
	private int telefone;

	public Cliente(int id, String nome, String endereco, int idade, int rg, int telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.rg = rg;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
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
		System.out.println("Idade: " + this.idade);
		System.out.println("Rg: " + this.rg);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("\n*************************");

	}
}