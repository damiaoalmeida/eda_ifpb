package lista.doubly.generica;

public class ListDEncadeada<T> {
	
	private Nodo<T> p;
	
	public void inserirNoComeco(T e) {
		Nodo<T> novo = new Nodo<>();
		novo.dado = e;
		
		if(!isVazia()) { 
			novo.prox = p;
			p.ant = novo;
		}
		p = novo;
	}
	
	public void inserirNoFinal(T e) {
		Nodo<T> novo = new Nodo<>();
		novo.dado = e;

		if(isVazia()) {
			p = novo;
			return;
		}
		
		Nodo<T> aux = p;
		while (aux.prox != null) {
			aux = aux.prox;
		}
		aux.prox = novo;
		novo.ant = aux;
	}
	
	public int quantidade() {
		int count = 0;
		Nodo<T> aux = p;
		while (aux != null) {
			aux = aux.prox;
			count++;
		}
		return count;
	}
	
	public void inserir(T e, int i) throws Exception {
		if (i < 0 || i > quantidade() + 1) {
			throw new Exception("índice inválido");
		}
		
		if(i == 0) {
			inserirNoComeco(e);
			return;
		}
		if(i == quantidade()) {
			inserirNoFinal(e);
			return;
		}
		
		Nodo<T> novo = new Nodo<>();
		novo.dado = e;
		
		Nodo<T> aux = p;
		for (int k = 1; k < i; k++) {
			aux = aux.prox;
		}
		
		novo.prox = aux.prox;
		novo.ant = aux;
		aux.prox.ant = novo;
		aux.prox = novo;
	}
	
	public boolean isVazia() {
		return p == null;
	}
	
	public void print() {
		Nodo<T> aux = p;
		while (aux != null) {
			System.out.println(aux.dado);
			aux = aux.prox;
		}
	}
	
	public static void main(String[] args) throws Exception {
		ListDEncadeada<Integer> lista = new ListDEncadeada<>();
		lista.inserirNoComeco(1);
		lista.inserirNoComeco(2);
		lista.inserirNoComeco(3);
		lista.inserirNoFinal(10);
		lista.inserir(5, 2);
		lista.print();
		
		System.out.println("   ");
		
		ListDEncadeada<String> lista2 = new ListDEncadeada<>();
		lista2.inserirNoComeco("A");
		lista2.inserirNoComeco("B");
		lista2.inserirNoComeco("D");
		lista2.inserirNoFinal("z");
		lista2.inserir("J", 2);
		lista2.print();
	}
}

class Nodo<T> {
	T dado;
	Nodo<T> prox;
	Nodo<T> ant;
}
