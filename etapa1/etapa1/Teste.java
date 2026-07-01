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
	
	public static void sort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int menor = i;
			
			for(int j = i; j < arr.length; j++) {
				if(arr[menor] > arr[j])
					menor = j;
			}
			int temp = arr[i];
			arr[i] = arr[menor];
			arr[menor] = temp;
			i++;
		}
	}
}
