package etapa1;

public class Teste {
	public static void main(String[] args) {
		int n = 16;
		for (int a = 1; a <= n; a *= 2) {
			int contador = 0;
			int x = a;
			while (x > 1) {
				x /= 2;
				contador++;
				System.out.println("Teste.main()");
			}
//			System.out.println("f(" + a + ") = " + contador);
		}

	}
}
