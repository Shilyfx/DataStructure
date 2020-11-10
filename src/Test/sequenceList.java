package Test;

public class sequenceList <T>{
    public T[] listArray;
    private int length=5;
    public sequenceList(){
		
	}
    public sequenceList(int n) {
        if (n <= 0) {
            System.out.println("error");
            System.exit(1);
        }
        length=0;
        listArray = (T[]) new Object[n];
    }
    public boolean add(T obj, int pos) {
        if (pos < 1 || pos > length + 1) {
            System.out.println("pos值不合法");
            return false;
        }
        if (listArray.length==pos) {
            T[] p = (T[]) new Object[length * 2];
            for (int i = 0; i < length; i++) {
                listArray=p;
            }
            for (int i = length; i >= pos; i--) {
                listArray[i] = listArray[i - 1];
                listArray[pos - 1] = obj;
                length++;
            }
        }
                return true;
            }


    public T remove(int pos) {
        if (isEmpty()) {
            System.out.println("顺序表为空，无法执行删除文件");
            return null;
        }else {
            if (pos<1||pos>length){
                System.out.println("pos值不合法");
                return null;
            }
            T x = listArray[pos - 1];
            for (int i = pos; i <= length; i++) {
                listArray[i - 1] = listArray[i];
                length--;
            }
            return x;
        }
    }

    public int find(T obj) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return -1;
        }else {
            for (int i = 0; i < length; i++) {
                if (listArray[i].equals(obj)) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public T value(int pos) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
            return null;
        }else{
            if (pos < 1 || pos > length) {
                System.out.println("pos值不合法");
                return null;
            }
        }
        return listArray[pos-1];
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void nextOrder(){
        for (int i = 0; i < length; i++) {
            System.out.println(listArray[i]);
        }
    }
    public void clear(){
        length=0;
    }
}

