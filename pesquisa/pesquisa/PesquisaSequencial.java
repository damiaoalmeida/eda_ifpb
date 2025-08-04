package pesquisa;

public class PesquisaSequencial {

    public static int pesquisaSequencial(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice do valor encontrado
            }
        }
        return -1; // Retorna -1 se o valor não estiver no array
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 6, 2};
        int valor = 8;
        int resultado = pesquisaSequencial(numeros, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}