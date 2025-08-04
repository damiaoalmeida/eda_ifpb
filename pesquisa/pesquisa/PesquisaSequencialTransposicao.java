package pesquisa;

public class PesquisaSequencialTransposicao {

    // Função que realiza a pesquisa sequencial com transposição de 1
    public static int pesquisaTransposicao(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                if (i > 0) {
                    // Troca com o elemento anterior
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    i = i - 1;
                }
                return i; // Retorna o índice atualizado
            }
        }
        return -1; // Retorna -1 se não encontrar
    }

    public static void main(String[] args) {
        // Array de exemplo
        int[] numeros = {10, 20, 30, 40, 50};

        // Valor a ser pesquisado
        int valor = 30;

        // Pesquisa com transposição
        int resultado = pesquisaTransposicao(numeros, valor);

        // Exibe o resultado
        if (resultado != -1) {
            System.out.println("Valor encontrado na posição (após transposição): " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }

        // Exibe o array após a transposição
        System.out.print("Array após a transposição: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}