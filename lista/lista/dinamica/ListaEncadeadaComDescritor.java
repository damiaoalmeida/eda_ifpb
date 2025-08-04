package lista.dinamica;

import java.util.Vector;

public class ListaEncadeadaComDescritor {
	
	////////Classes internas
    private static class No {
        int dado;
        No proximo;
        
        public No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    private static class Descritor {
        int tamanho;
        No inicio;
        No fim;
        
        public Descritor() {
            this.tamanho = 0;
            this.inicio = null;
            this.fim = null;
        }
    }
    
    ////////////////////////////////////
    
    private Descritor descritor;
    
    public ListaEncadeadaComDescritor() {
        this.descritor = new Descritor();
    }
    
    public void inserirNoFim(int dado) {
        No novoNo = new No(dado);
        if (descritor.inicio == null) {
            descritor.inicio = novoNo;
            descritor.fim = novoNo;
        } else {
            descritor.fim.proximo = novoNo;
            descritor.fim = novoNo;
        }
        descritor.tamanho++;
    }

    public void inserirNoInicio(int dado) {
    	//Faça você mesmo
    }

    public void removerNoInicio() {
        if (descritor.inicio != null) {
            descritor.inicio = descritor.inicio.proximo;
            descritor.tamanho--;
            if (descritor.inicio == null) {
                descritor.fim = null;
            }
            Vector<String> v;
        }
    }
    
    public void removerNoFim() {
    	//Faça você mesmo
    }
    
    public void exibirLista() {
        No atual = descritor.inicio;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
    
    public int tamanho() {
        return descritor.tamanho;
    }
    
    public static void main(String[] args) {
        ListaEncadeadaComDescritor lista = new ListaEncadeadaComDescritor();
        lista.inserirNoFim(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        
        System.out.println("Lista após inserções:");
        lista.exibirLista();
        System.out.println("Tamanho: " + lista.tamanho());
        
        lista.removerNoInicio();
        System.out.println("Lista após remoção:");
        lista.exibirLista();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}