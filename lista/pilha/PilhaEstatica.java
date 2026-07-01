package pilha;

public class PilhaEstatica implements Pilha {
	
	private int array[];
	private int tamanho;
	
	public PilhaEstatica (int size) {
		array = new int[size];
		tamanho = 0;
	}

	@Override
	public void push(int e) throws Exception {
		if(isFull()) {
			throw new Exception("Pilha cheia");
		}
		array[tamanho++] = e;
	}

	@Override
	public int pop() throws Exception {
		if(isEmpty())
			throw new Exception("Pilha vazia");
		return array[--tamanho];
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return tamanho == 0;
	}

	@Override
	public boolean isFull() {
		return tamanho == array.length;
	}

	@Override
	public int size() {
		return tamanho;
	}
	
	public void print() {
		for (int i = 0 ; i < tamanho; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Pilha p = new PilhaEstatica(5);
		p.push(4);
		p.push(10);
		p.push(8);
		p.push(3);
		p.push(2);
		p.print();
		p.pop();
		p.push(99);
		System.out.println("");
		p.print();
	}
}
