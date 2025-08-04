package etapa1;

public class LogaritmoBase2 {
    public static void main(String[] args) {
    	log(100);
    }
    
    public static void log(int n) {

    	for (int a = 1; a <= n; a *= 2) {
            int contador = 0;
            int x = a;

            while (x > 1) {
                x /= 2;
                contador++;
            }

            System.out.println("f(" + a + ") = " + contador);
        }
    }
}
