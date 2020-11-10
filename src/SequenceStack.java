
public class SequenceStack<T> {
	final int MaxSize = 10;
	private T[] stackArray;
	private int top ;
	//无参构造法
	public SequenceStack(){
		top = -1;
		stackArray = (T[])new Object[MaxSize];
		
	}
	//有参构造
	public SequenceStack(int n) {
		if(n<=0) {
			System.out.println("栈不能为空，错误");
			System.exit(-1);
		}
		top = -1;
		stackArray = (T[])new Object[n];
	}
	//栈元素的添加 入栈
	public void push(T obj) {
		if(top==stackArray.length-1) {					//防止栈的溢出
			T[] stack =(T[]) new Object[top*2];
			for(int i = 0;i<=top;i++) {
				stack[i]=stackArray[i];
			}
			stackArray=stack;
		}
		top++;                                //top++直接加入元素
		stackArray[top]=obj;
	}
	//栈顶元素的删除   出栈
	public T pull() {
		if(top==-1) {
			System.out.println("空栈，无任何元素");
			return null;
		}
		top--;
		return stackArray[top+1];
	}
	//取出栈顶元素
	public T getHead() {
		if(top==-1) {
			System.out.println("空栈，无任何元素");
			return null;
		}
		return stackArray[top];
	}
	//判空
	public boolean isEmpty() {
		return top==-1;
	}
	//长度
	public int Size() {
		return stackArray.length;
	}
	//栈的遍历
	public void nextOrder() {
		for(int i=top;i<=0;i++) {
			System.out.println(stackArray[i]);
		}
	}
	//栈的回收
	public void clear() {
		top=-1;
	}
	
	
}
