package lista.ordened.generica;

import java.util.Random;

public class No<T extends Comparable<T>> {
	private T dado;
	private No<T> proximo;

	public No(T dado) {
		this.dado = dado;
		this.proximo = null;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	public boolean ehDadoIgual(No<T> b) {
		return getDado().compareTo(b.getDado()) == 0;
	}
	
	public boolean ehDadoMaior(No<T> b) {
		return getDado().compareTo(b.getDado()) > 0;
	}
	
	public boolean ehDadoMenor(No<T> b) {
		return getDado().compareTo(b.getDado()) < 0;
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		No<Double> a = new No<Double>(random.nextDouble(101));
		No<Double> b = new No<Double>(random.nextDouble(101));

		if(a.ehDadoIgual(b)) {
			System.out.println(a.getDado() + " = " + b.getDado());
		} else if(a.ehDadoMaior(b)) {
			System.out.println(a.getDado() + " > " + b.getDado());
		} else {
			System.out.println(a.getDado() + " < " + b.getDado());
		}
	}
}