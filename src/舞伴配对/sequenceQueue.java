package ������;

public class sequenceQueue<T> {
	final int MaxSize = 10;
	private T quenceArray [];
	private int front ,rear;
	public sequenceQueue () {
		front = rear = 0;
		quenceArray=(T[]) new Object[MaxSize];
	}
	//���
	public void EnQueue(T obj) {
		if((rear+1)%quenceArray.length==front) {   //�������
			T[]p=(T[])new Object[quenceArray.length*2];
			if((rear+1)%quenceArray.length==front) {  //�ж�rear��ʱ��λ��   ��ʱrear>front
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
	//�жϷǿ�
	public boolean isEmpty() {
		return rear==front;
	}
	//����	�Ƚ��ȳ�
	public T DeQueue() {
		if(isEmpty()) {
				System.out.println("�˶���Ϊ��");
				return null;
		}
		front =(front+1)%quenceArray.length;
		return quenceArray[front];
	}
	//��ȡͷԪ�� ����frontλ�õ�Ԫ��
	public T GetHead() {
		if(isEmpty()) {
			System.out.println("�˶���Ϊ��");
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
