package funcionario;

public class Funcionario {
	private int id;
	private String nome;
	private String endereco;
	private String cargo;
	private int idade;
	private int telefone;
	private int rg;
	
	public Funcionario(){}

	public Funcionario(int id, String nome, String endereco, String cargo, int idade, int telefone, int rg) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cargo = cargo;
		this.idade = idade;
		this.telefone = telefone;
		this.rg = rg;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public void visualizar() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Rg: " + this.rg);
		System.out.println("\n*************************");

	}
}