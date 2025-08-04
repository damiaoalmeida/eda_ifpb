package pesquisa;

public class PesquisaSequencialSentinela {

    public static <T extends Comparable<T>> int buscar(T[] array, T chave) {
        int n = array.length;

        // Cria um novo array com espaço para a sentinela
        @SuppressWarnings("unchecked")
        T[] novoArray = (T[]) new Comparable[n + 1];

        // Copia os elementos para o novo array
        System.arraycopy(array, 0, novoArray, 0, n);

        // Adiciona a sentinela (chave a ser buscada)
        novoArray[n] = chave;

        int i = 0;
        while (!novoArray[i].equals(chave)) {
            i++;
        }

        // Verifica se encontrou dentro do array original
        return (i < n) ? i : -1;
    }

    public static void main(String[] args) {
        Integer[] numeros = {3, 8, 10, 4, 1, 7};
        String[] nomes = {"Carlos", "Ana", "João", "Maria"};

        System.out.println("Posição do 4: " + buscar(numeros, 4));        // 3
        System.out.println("Posição do João: " + buscar(nomes, "João"));  // 2
        System.out.println("Posição do 9: " + buscar(numeros, 9));        // -1
    }
}

