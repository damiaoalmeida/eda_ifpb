package etapa1;

public class FibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base da recursão
        }
        
        // Chamadas recursivas
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static int fibonacci2(int n) {
        if (n == 1) {
            return 1;
        } else {
        	if(n == 2) {
        		return 1;
        	} else {
        		return fibonacci2(n - 1) + fibonacci2(n - 2);        		
        	}
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Exemplo de número de Fibonacci a ser calculado
        System.out.println("O " + n + "º número de Fibonacci é: " + fibonacci(n));
        System.out.println(fibonacci2(10));
    }
}

