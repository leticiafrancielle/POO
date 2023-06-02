package game;

public class TesteGame {

	public static void main(String[] args) {
		
		Produto game1 = new Produto(1, "The Last Of Us", "Playstation", 3, 500.00);
		game1.visualizar();
		
		Produto game2 = new Produto(2, "Sonic", "Nintendo", 7, 1.000);
		game2.visualizar();
	}
}