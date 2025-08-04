package etapa1;

public class MatrizMultiplicacao {
	
    public static void imprimirMatrizMultiplicacao(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i] * arr[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};  // Exemplo de array de inteiros
        System.out.println("Matriz de multiplicação:");
        imprimirMatrizMultiplicacao(arr);
    }
}
