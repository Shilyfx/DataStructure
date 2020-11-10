package OrderlyList;
import java.util.ArrayList;

public class SequenceList<T> {
	final int maxSize = 10;
	public int length = 10;
	public T [] listArray;
	//����ղ���
	public SequenceList(){
		length = 0;
		listArray = (T [])new Object[maxSize];
	}
	//�����ܹ����峤�ȵ���
	public SequenceList(int n) {
		if(n<=0) {
			System.out.println("error");
			System.exit(1);
		}
		length = 0;
		listArray = (T [])new Object[maxSize];
	}
	//���Ԫ��
	public boolean add(T obj,int pos) {
		if(pos<1||pos>length+1) {
			System.out.println("error");
		}
		if(listArray.length==pos) {
			T [] p = (T[])new Object[length*2];
			for(int i=0;i<listArray.length;i++) {
				p[i]=listArray[i];
			}
			listArray = p;
		}
		for(int i=length;i>=pos;i--) {
			listArray[i]=listArray[i-1];
		}
		listArray[pos-1] = obj;
		length++;
		return true;
	}
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty() {
		return length== 0;
	}
	//ɾ��Ԫ��
	public T remove(int pos) {
		if(isEmpty()) {
			System.out.println("���б�Ϊ��");
			return null;
		}
		if(pos<1||pos>length) {
			System.out.println("��������ֵΪ���Ϸ���");
			return null;
		}
		T x = listArray[length - 1];
		for(int i = pos;i<length;i++) {
			listArray[i-1] = listArray[i];
		}
		length--;
		return x;
	}
	//����Ԫ��
	public void nextOrder() {
		System.out.print("���б��е�Ԫ�أ�");
		for(int i = 0;i<length;i++) {
			System.out.print(listArray[i] + " ");
			
		}
		System.out.println(" ");
	}
	//����Ԫ��
	public int find(T obj) {
		if(isEmpty()) {
			System.out.println("���б�Ϊ��");
			return -1;
		}else {
			for(int i=0;i<length;i++) {
				if(listArray[i].equals(obj)) {
					return i+1;
				}
					
			}
			return -1;
		}
	}
	//��ȡԪ��
	public T value(int pos) {
		if(isEmpty()) {
			System.out.println("����Ϊ��");
			return null;
		}else {
			if(pos<1||pos>length) {
				System.out.println("��������ֵ���Ϸ�");
				return null;
			}
			return listArray[pos-1];
		}
		
	}
	//�滻����Ԫ��
	public boolean modify(T obj,int pos) {
		if(isEmpty()) {
			System.out.println("����Ϊ��");
			return false;
		}else {
			if(pos<1||pos>length) {
				System.out.println("��������ֵ���Ϸ�");
				return false;
			}
		}
		listArray[pos] = obj;
		return true;
			
	}


	//�ͷ�Ԫ��
	public void clear() {
		length = 0;
	}
}

