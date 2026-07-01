package pilha;

public class PilhaDinamica implements Pilha{
	
	private No p;

	@Override
	public void push(int e) throws Exception {
		No novo = new No();
		novo.dado = e;
		novo.prox = p;
		p = novo;
	}

	@Override
	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Pilha vazia");
		int dado = p.dado;
		p = p.prox;
		return dado;
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

class No{
	int dado;
	No prox;
}