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
		System.out.println("序列表的长度为："+L.length);
		L.isEmpty();
		emptyFlag = L.isEmpty();
		if(emptyFlag) {
			System.out.println("序列表为空");
		}else {
			System.out.println("序列表不为空");
		}
		System.out.println("序列表第3个元素为："+L.value(3));
		System.out.println("c所在位置索引值为："+L.find("c"));
		L.add("e", 5);
		L.nextOrder();
		L.remove(3);
		L.nextOrder();
		L.clear();
		
		
		
	}
}
