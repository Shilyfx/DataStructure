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
        System.out.println("˳���L���ַ�Ԫ��Ϊ��");
        L.nextOrder();
        System.out.println("˳���L�ĳ���Ϊ��"+data.length);
        emptyFlag= L.isEmpty();
        if(emptyFlag)
        {
            System.out.println("˳���LΪ��");
        }
        else
        {
            System.out.println("˳���L��Ϊ��");
        }
        System.out.println("˳���L�ĵ�����Ԫ��Ϊ��"+L.value(3));
        System.out.println("˳�����C��λ��Ϊ��"+L.find("c"));

        L.add("e",5);
        System.out.println("�����˳���L���ַ�Ԫ��Ϊ��");
        L.nextOrder();
        L.remove(3);
        System.out.println("ɾ����˳���L���ַ�Ԫ��Ϊ��");
        L.nextOrder();
        L.clear();
    }
}

