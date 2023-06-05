package ingresso;

public class TesteIngresso {

	public static void main(String[] args) {

		Ingresso ingresso1 = new Ingresso(1, "Renaissance Tour", "Las Vegas", true, 8000);
		ingresso1.visualizar();
		
		Ingresso ingresso2 = new Ingresso(2, "NBA House", "Miami", true, 7000);
		ingresso2.visualizar();
	}
}