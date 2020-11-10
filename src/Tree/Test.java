package Tree;


public class Test {

	/**主函数部分
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
        System.out.println("原始二叉树:");
        tree.traversal(0);
       
        
        //2.输出二叉树的所有叶子节点
        System.out.println("\n二叉树的所有叶子节点:");
        tree.yezi(tree.root);
         
        //3.统计节点数量
        System.out.println("\n节点的数量为："+tree.count(tree.root));
        
        //4.交换二叉树任意两个节点（假设二叉树的每个节点的值都不一样）
        Node<Integer> node1 = tree.search(tree.root, 3);
        Node<Integer> node2 = tree.search(tree.root, 7);
        int temp = node1.getData();
        node1.setData(node2.getData());
        node2.setData(temp);
        System.out.print("节点3和节点7交换后：");
        tree.traversal(0);       
        System.out.println("(先序遍历)");
       
        
        
        //5.将现有二叉树的某个子树a移到其他子树b中
        Node<Integer> a = tree.search(tree.root, 2);
        Node<Integer> b = tree.search(tree.root, 3);
  
        //5.1查找a的双亲
        Node<Integer> parentOfa=tree.search2(tree.root,a.getData());
        //System.out.println("a的双亲是:"+parentOfa.getData());       
        System.out.println("a的双亲:"+parentOfa.getData());   
        System.out.println();
        //插入操作将a插到b中
        tree.insertl(a, b); 
        //将子树a置空
        if(parentOfa.lChild!=null && parentOfa.lChild.getData().equals(a.getData()))
        	parentOfa.lChild=null; 
        else
        	if(parentOfa.rChild!=null && parentOfa.rChild.getData().equals(a.getData()))
        		parentOfa.rChild=null;     
        //遍历一下,检验是否正确
        System.out.println("将a移到b以后：");
        tree.traversal(0);
        System.out.println("(先序)");           
        tree.traversal(1);
        System.out.println("(中序)");
        
          
        //6.删除一个节点
        //找到这个节点
        Node<Integer> delete = tree.search(tree.root, 3);
        //找到这个节点的双亲节点
        Node<Integer> parentOfdelete=tree.search2(tree.root,delete.getData());
        if(parentOfdelete.lChild!=null && parentOfdelete.lChild.getData().equals(delete.getData()))
        	parentOfdelete.lChild=null; 
        else
        	if(parentOfdelete.rChild!=null && parentOfdelete.rChild.getData().equals(delete.getData()))
        		parentOfdelete.rChild=null; 
        //找到节点的左孩子和右孩子
        Node<Integer> left = delete.lChild;
        Node<Integer> right = delete.rChild;
        //插入操作
        if (left != null) {
			tree.insertl(left,parentOfdelete);
		}
        if (right != null) {
			tree.insertr( right,parentOfdelete);
		}
        //遍历一下,检验是否正确
        System.out.println("删除节点以后:");
        tree.traversal(0);
        System.out.println("(先序)");
        tree.traversal(1);       
        System.out.println("(中序)");        
      
        //7.缩进结构打印
        System.out.println("缩进结构打印:");
        tree.suojing(tree.root,0);
        
        
     }
	

}
