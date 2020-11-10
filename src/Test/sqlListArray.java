package Test;

public class sqlListArray {
    public static void main(String[] args) {
        int i;
        boolean emptyFlag;
        String[] data={"a","b","c","d","f"};
        sequenceList<String> L=new sequenceList<String>();
        for(i=0;i<data.length;i++)
        {
            L.add(data[i],i+1);
        }
        System.out.println("顺序表L的字符元素为：");
        L.nextOrder();
        System.out.println("顺序表L的长度为："+data.length);
        emptyFlag= L.isEmpty();
        if(emptyFlag)
        {
            System.out.println("顺序表L为空");
        }
        else
        {
            System.out.println("顺序表L不为空");
        }
        System.out.println("顺序表L的第三个元素为："+L.value(3));
        System.out.println("顺序表中C的位置为："+L.find("c"));

        L.add("e",5);
        System.out.println("插入后顺序表L的字符元素为：");
        L.nextOrder();
        L.remove(3);
        System.out.println("删除后顺序表L的字符元素为：");
        L.nextOrder();
        L.clear();
    }
}

