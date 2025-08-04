package pesquisa;

public class PesquisaSequencialOrdenada {
    public static int pesquisaOrdenada(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Retorna o índice se o valor for encontrado
            }
            if (array[i] > valor) {
                break; // Interrompe a busca se o elemento atual for maior que o valor
            }
        }
        return -1; // Retorna -1 se o valor não foi encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valor = 25;

        // Realiza a pesquisa
        int resultado = pesquisaOrdenada(numeros, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}