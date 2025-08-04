package pesquisa;

public class PesquisaSequencialTransposicaoVarios {

    // Pesquisa sequencial com transposição de vários
    public static int pesquisaTransposicaoVarios(int[] array, int valor, int posicoes) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                // Calcula o índice para onde o valor será movido
                int novoIndice = Math.max(0, i - posicoes); // Garante que o índice não seja menor que 0
                
                // Move o valor para o novo índice
                int temp = array[i];
                for (int j = i; j > novoIndice; j--) {
                    array[j] = array[j - 1]; // Desloca os elementos intermediários
                }
                array[novoIndice] = temp;

                return novoIndice; // Retorna o índice atualizado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valor = 40;
        int posicoes = 2; // Quantidade de posições para mover

        // Pesquisa com transposição de vários
        int resultado = pesquisaTransposicaoVarios(numeros, valor, posicoes);

        if (resultado != -1) {
            System.out.println("Valor encontrado e transposto.");
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
