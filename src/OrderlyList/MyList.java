package OrderlyList;

public class MyList {
	public static void main(String[] args) {
		int i;
		boolean emptyFlag;
		String [] data = {"a","b","c","d","f"};
		SequenceList<String> L = new SequenceList<>();
		for(i = 0;i<data.length;i++) {
			L.add(data[i], i+1);
		}
		L.nextOrder();
		System.out.println("���б�ĳ���Ϊ��"+L.length);
		L.isEmpty();
		emptyFlag = L.isEmpty();
		if(emptyFlag) {
			System.out.println("���б�Ϊ��");
		}else {
			System.out.println("���б�Ϊ��");
		}
		System.out.println("���б��3��Ԫ��Ϊ��"+L.value(3));
		System.out.println("c����λ������ֵΪ��"+L.find("c"));
		L.add("e", 5);
		L.nextOrder();
		L.remove(3);
		L.nextOrder();
		L.clear();
		
		
		
	}
}
