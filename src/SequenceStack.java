
public class SequenceStack<T> {
	final int MaxSize = 10;
	private T[] stackArray;
	private int top ;
	//�޲ι��취
	public SequenceStack(){
		top = -1;
		stackArray = (T[])new Object[MaxSize];
		
	}
	//�вι���
	public SequenceStack(int n) {
		if(n<=0) {
			System.out.println("ջ����Ϊ�գ�����");
			System.exit(-1);
		}
		top = -1;
		stackArray = (T[])new Object[n];
	}
	//ջԪ�ص���� ��ջ
	public void push(T obj) {
		if(top==stackArray.length-1) {					//��ֹջ�����
			T[] stack =(T[]) new Object[top*2];
			for(int i = 0;i<=top;i++) {
				stack[i]=stackArray[i];
			}
			stackArray=stack;
		}
		top++;                                //top++ֱ�Ӽ���Ԫ��
		stackArray[top]=obj;
	}
	//ջ��Ԫ�ص�ɾ��   ��ջ
	public T pull() {
		if(top==-1) {
			System.out.println("��ջ�����κ�Ԫ��");
			return null;
		}
		top--;
		return stackArray[top+1];
	}
	//ȡ��ջ��Ԫ��
	public T getHead() {
		if(top==-1) {
			System.out.println("��ջ�����κ�Ԫ��");
			return null;
		}
		return stackArray[top];
	}
	//�п�
	public boolean isEmpty() {
		return top==-1;
	}
	//����
	public int Size() {
		return stackArray.length;
	}
	//ջ�ı���
	public void nextOrder() {
		for(int i=top;i<=0;i++) {
			System.out.println(stackArray[i]);
		}
	}
	//ջ�Ļ���
	public void clear() {
		top=-1;
	}
	
	
}
