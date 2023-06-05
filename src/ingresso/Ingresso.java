package ingresso;

public class Ingresso {
	private int id;
	private String nomeEvento;
	private String endereco;
	private boolean estaValido;
	private float valor;
	
	public Ingresso(int id, String nomeEvento, String endereco, boolean estaValido, float valor) {
		this.id = id;
		this.nomeEvento = nomeEvento;
		this.endereco = endereco;
		this.estaValido = estaValido;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean getEstaValido() {
		return estaValido;
	}

	public void setEstaValido(boolean estaValido) {
		this.estaValido = estaValido;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void visualizar() {
		System.out.println("Id: " + this.id);
		System.out.println("Nome do evento: " + this.nomeEvento);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Está válido?: " + this.estaValido);
		System.out.println("Valor: " + this.valor);
		System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * *");

	}
}