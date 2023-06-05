package curso;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso(1, "Dev Full Stack", "3 meses", true, true);
		curso1.visualizar();
		
		Curso curso2 = new Curso(2, "Dev back-end", "9 meses", true, true);
		curso2.visualizar();
	}
}