package pilha;

public interface Pilha {
	public void push(int e) throws Exception;
	public int pop() throws Exception;
	public int top();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
	public void print();
}
