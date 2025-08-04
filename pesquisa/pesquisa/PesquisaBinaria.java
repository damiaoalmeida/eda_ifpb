package pesquisa;

public class PesquisaBinaria {
    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0, fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == valor) {
                return meio; // Elemento encontrado
            } else if (array[meio] < valor) {
                inicio = meio + 1; // Buscar na metade direita
            } else {
                fim = meio - 1; // Buscar na metade esquerda
            }
        }
        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int valorBuscado = 23;
        
        int resultado = buscaBinaria(numeros, valorBuscado);
        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
