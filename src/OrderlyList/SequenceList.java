package OrderlyList;
import java.util.ArrayList;

public class SequenceList<T> {
	final int maxSize = 10;
	public int length = 10;
	public T [] listArray;
	//创造空参类
	public SequenceList(){
		length = 0;
		listArray = (T [])new Object[maxSize];
	}
	//创造能够定义长度的类
	public SequenceList(int n) {
		if(n<=0) {
			System.out.println("error");
			System.exit(1);
		}
		length = 0;
		listArray = (T [])new Object[maxSize];
	}
	//添加元素
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
	//判断是非为空
	public boolean isEmpty() {
		return length== 0;
	}
	//删除元素
	public T remove(int pos) {
		if(isEmpty()) {
			System.out.println("序列表为空");
			return null;
		}
		if(pos<1||pos>length) {
			System.out.println("输入索引值为不合法；");
			return null;
		}
		T x = listArray[length - 1];
		for(int i = pos;i<length;i++) {
			listArray[i-1] = listArray[i];
		}
		length--;
		return x;
	}
	//遍历元素
	public void nextOrder() {
		System.out.print("序列表中的元素：");
		for(int i = 0;i<length;i++) {
			System.out.print(listArray[i] + " ");
			
		}
		System.out.println(" ");
	}
	//查找元素
	public int find(T obj) {
		if(isEmpty()) {
			System.out.println("序列表为空");
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
	//获取元素
	public T value(int pos) {
		if(isEmpty()) {
			System.out.println("序列为空");
			return null;
		}else {
			if(pos<1||pos>length) {
				System.out.println("输入索引值不合法");
				return null;
			}
			return listArray[pos-1];
		}
		
	}
	//替换更改元素
	public boolean modify(T obj,int pos) {
		if(isEmpty()) {
			System.out.println("序列为空");
			return false;
		}else {
			if(pos<1||pos>length) {
				System.out.println("输入索引值不合法");
				return false;
			}
		}
		listArray[pos] = obj;
		return true;
			
	}


	//释放元素
	public void clear() {
		length = 0;
	}
}

