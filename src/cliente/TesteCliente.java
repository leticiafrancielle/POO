package cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Letícia", "rua jacaranda", 19, 23451627, 98783735);
		cliente1.visualizar();

		Cliente cliente2 = new Cliente(2, "Jozelia", "rua dali", 25, 894764647, 948974366);
		cliente2.visualizar();
	}
}