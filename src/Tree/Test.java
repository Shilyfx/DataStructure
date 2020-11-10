package Tree;


public class Test {

	/**����������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated Smethod stub
		int[] aa= new int[]{1,2,3,4};
		int[] bb= new int[]{5,6,7,8};
		BinaryTree<Integer> tree = new BinaryTree<>(0);
		Node<Integer> node = tree.root;
        for (int i = 0; i < aa.length; i++) {
			tree.insertLeft(aa[i], node);
			tree.insertRight(bb[i], node);
		}
        System.out.println("ԭʼ������:");
        tree.traversal(0);
       
        
        //2.���������������Ҷ�ӽڵ�
        System.out.println("\n������������Ҷ�ӽڵ�:");
        tree.yezi(tree.root);
         
        //3.ͳ�ƽڵ�����
        System.out.println("\n�ڵ������Ϊ��"+tree.count(tree.root));
        
        //4.�������������������ڵ㣨�����������ÿ���ڵ��ֵ����һ����
        Node<Integer> node1 = tree.search(tree.root, 3);
        Node<Integer> node2 = tree.search(tree.root, 7);
        int temp = node1.getData();
        node1.setData(node2.getData());
        node2.setData(temp);
        System.out.print("�ڵ�3�ͽڵ�7������");
        tree.traversal(0);       
        System.out.println("(�������)");
       
        
        
        //5.�����ж�������ĳ������a�Ƶ���������b��
        Node<Integer> a = tree.search(tree.root, 2);
        Node<Integer> b = tree.search(tree.root, 3);
  
        //5.1����a��˫��
        Node<Integer> parentOfa=tree.search2(tree.root,a.getData());
        //System.out.println("a��˫����:"+parentOfa.getData());       
        System.out.println("a��˫��:"+parentOfa.getData());   
        System.out.println();
        //���������a�嵽b��
        tree.insertl(a, b); 
        //������a�ÿ�
        if(parentOfa.lChild!=null && parentOfa.lChild.getData().equals(a.getData()))
        	parentOfa.lChild=null; 
        else
        	if(parentOfa.rChild!=null && parentOfa.rChild.getData().equals(a.getData()))
        		parentOfa.rChild=null;     
        //����һ��,�����Ƿ���ȷ
        System.out.println("��a�Ƶ�b�Ժ�");
        tree.traversal(0);
        System.out.println("(����)");           
        tree.traversal(1);
        System.out.println("(����)");
        
          
        //6.ɾ��һ���ڵ�
        //�ҵ�����ڵ�
        Node<Integer> delete = tree.search(tree.root, 3);
        //�ҵ�����ڵ��˫�׽ڵ�
        Node<Integer> parentOfdelete=tree.search2(tree.root,delete.getData());
        if(parentOfdelete.lChild!=null && parentOfdelete.lChild.getData().equals(delete.getData()))
        	parentOfdelete.lChild=null; 
        else
        	if(parentOfdelete.rChild!=null && parentOfdelete.rChild.getData().equals(delete.getData()))
        		parentOfdelete.rChild=null; 
        //�ҵ��ڵ�����Ӻ��Һ���
        Node<Integer> left = delete.lChild;
        Node<Integer> right = delete.rChild;
        //�������
        if (left != null) {
			tree.insertl(left,parentOfdelete);
		}
        if (right != null) {
			tree.insertr( right,parentOfdelete);
		}
        //����һ��,�����Ƿ���ȷ
        System.out.println("ɾ���ڵ��Ժ�:");
        tree.traversal(0);
        System.out.println("(����)");
        tree.traversal(1);       
        System.out.println("(����)");        
      
        //7.�����ṹ��ӡ
        System.out.println("�����ṹ��ӡ:");
        tree.suojing(tree.root,0);
        
        
     }
	

}
