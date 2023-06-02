package funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(1, "Kiara", "rua arthur", "Dev", 25, 98814212, 2365142);
		funcionario1.visualizar();

		Funcionario funcionario2 = new Funcionario(2, "Vinicius", "rua capoeira", "Tech Lider", 25,988172762, 2365124);
		funcionario2.visualizar();
	}
}