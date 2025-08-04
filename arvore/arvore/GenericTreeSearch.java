package arvore;

import java.util.ArrayList;
import java.util.List;

public class GenericTreeSearch {

    // Classe que representa um nó da árvore
    static class Node<T> {
        T value;
		List<Node<T>> children;

        Node(T value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
        
        public T getValue() {
			return value;
		}

        public void setValue(T value) {
			this.value = value;
		}

        void addChild(Node<T> child) {
            children.add(child);
        }

        // Função de busca: retorna true se encontrar o valor
        public boolean search(T target) {
            if (value.equals(target)) return true;

            // Percorre recursivamente os filhos
            for (Node<T> child : children) {
                if (child.search(target)) {
                    return true;
                }
            }

            return false;
        }
    }

//    // Função de busca: retorna true se encontrar o valor
//    public static boolean search(Node<T> root, T target) {
//        if (root.getValue.equals(target)) return true;
//
//        // Percorre recursivamente os filhos
//        for (Node<T> child : root.children) {
//            if (search(child, target)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    // Exemplo de uso
    public static void main(String[] args) {
        Node<Integer> root = new Node<Integer>(10);
        Node<Integer> child1 = new Node<Integer>(20);
        Node<Integer> child2 = new Node<Integer>(30);
        Node<Integer> child3 = new Node<Integer>(40);

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);

        int target = 40;
        boolean found = root.search(target);

        System.out.println("Valor " + target + (found ? " encontrado." : " não encontrado."));
    }
}

