package etapa1;

public class Div2 {
	
	public static int div2(int n) {
		int count = 0;
		int i = n;
		while (i > 1) {
			count++;
			i = i/2;
		}
		return count;
	}

	public static int div2Array(int [] n) {
		int soma = 0;
		for (int i = 0; i < n.length ; i++) {
			int valor = div2(n[i]);
			soma += valor;
			System.out.println("div(" + n[i] + ") = " + valor);
		}
		return soma;
	}

	public static void main(String[] args) {
//		System.out.println(div2(32));
		int array [] = {4, 65, 32, 105};
		int resultado = div2Array(array);
		System.out.println(resultado);
	}
}