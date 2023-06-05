package farmacia;

public class TesteFarmacia {
	
	public static void main(String[] args) {
	
	Farmacia farmacia1 = new Farmacia(1, "Drogasil", "rua augusta 23", true, false, 978674523);
	farmacia1.visualizar();
	
	Farmacia farmacia2 = new Farmacia(2, "Drogaria São Paulo", "rua ferreira 123", false, true, 976355453);
	farmacia2.visualizar();
	}
}