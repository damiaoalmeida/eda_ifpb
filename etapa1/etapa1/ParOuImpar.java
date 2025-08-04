package etapa1;

import java.math.BigInteger;

public class ParOuImpar {

	public static void parOuImpar(long n) {
		if (n % 2 == 0)
			System.out.println("o número é par");
		else
			System.out.println("o número é ímpar");
	}

	public static void parOuImpar(String s) {
		BigInteger n =  new BigInteger(s);
		if ((n.mod(new BigInteger("2"))).equals(BigInteger.ZERO))
			System.out.println("o número é par");
		else
			System.out.println("o número é impar");
	}
	
	public static void parOuImparChar(String n) {
		int indice = n.length() - 1;
		char digito_final = n.charAt(indice);
		switch (digito_final) {
			case '0': case '2': case '4': case '6': case '8':
				System.out.println("o número é par");
				break;
			default:
				System.out.println("o número é impar");
		}
	}

	public static void main(String[] args) {
		long n = 999999999999999991L;
		String s = n+""+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n+n;

		long t1 = System.currentTimeMillis();
		parOuImpar(s);
		long t2 = System.currentTimeMillis();
		System.out.println("parOuImpar() Tempo: " + (t2 - t1));
		
		t1 = System.currentTimeMillis();
		parOuImparChar(s);
		t2 = System.currentTimeMillis();
		System.out.println("parOuImparChar() Tempo: " + (t2 - t1));
	}
}
