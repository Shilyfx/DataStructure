package 舞伴配对;

public class sequenceQueue<T> {
	final int MaxSize = 10;
	private T quenceArray [];
	private int front ,rear;
	public sequenceQueue () {
		front = rear = 0;
		quenceArray=(T[]) new Object[MaxSize];
	}
	//入队
	public void EnQueue(T obj) {
		if((rear+1)%quenceArray.length==front) {   //队满溢出
			T[]p=(T[])new Object[quenceArray.length*2];
			if((rear+1)%quenceArray.length==front) {  //判断rear此时的位置   此时rear>front
				for(int i=0;i<=rear;i++) {
					p[i]=quenceArray[i];
				}
			}
			else {									//rear<front 
				int i,j=1;
				for(i=front;i<=quenceArray.length;i++,j++) {
					p[j]=quenceArray[i];
				}
				for(i=0;i<=rear;i++,j++) {
					p[j]=quenceArray[i];
				}
				front=0;
				rear=quenceArray.length-1;
			}
			quenceArray=p;
		}
		rear=(rear+1)%quenceArray.length;
		quenceArray[rear]=obj;
	}
	//判断非空
	public boolean isEmpty() {
		return rear==front;
	}
	//出队	先进先出
	public T DeQueue() {
		if(isEmpty()) {
				System.out.println("此队列为空");
				return null;
		}
		front =(front+1)%quenceArray.length;
		return quenceArray[front];
	}
	//获取头元素 及在front位置的元素
	public T GetHead() {
		if(isEmpty()) {
			System.out.println("此队列为空");
			return null;
		}
		front = (front+1)%quenceArray.length;
		return quenceArray[front];
	}
	public int size() {
		
		return (rear-front+quenceArray.length)%quenceArray.length;
	}
	public void nextOrder() {
		int i ,j=front;
		for(i=1;i<=size();i++) {
			j=(j+1)%quenceArray.length;
			System.out.println(quenceArray[j]);
		}
	}

}
