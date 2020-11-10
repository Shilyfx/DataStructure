package Tree;

class Node<T> {
	private T data;
	public Node<T> lChild;
	public Node<T> rChild;
	public Node(){
		data = null;
		lChild = null;
		rChild = null;
	}
	public Node(T elem){
		data = elem;
		lChild = null;
		rChild = null;
	}
	public T getData(){
		return data;
	}
	public void setData(T y){
		data = y;
	}
}

class BinaryTree<T>{
	public Node<T> root;
	private final int maxNodes=100;
	public BinaryTree()  {
		 this.root = new Node<T>();
	}    
	public BinaryTree(T x)   {
		this.root = new Node<T>(x);
	}

	public boolean insertLeft(T x, Node<T> parent){ 
		if(parent==null)	return false;
		Node<T> p= new Node<T>(x);
		if(parent.lChild==null) parent.lChild = p;
		else
		{
			p.lChild = parent.lChild;
			parent.lChild = p;
		}
		return true;
	} 
   
    public boolean insertRight(T x, Node<T> parent){ 
		if(parent==null)	return false;
		Node<T> p= new Node<T>(x);
		if(parent.rChild==null) parent.rChild = p;
		else{
			p.rChild = parent.rChild;
			parent.rChild = p;
		}
		return true; 
	}
    
  
    public boolean deleteLeft(Node<T> parent){
    	if(parent==null)	return false;
    	else
    	{
    		parent.lChild=null;
    		return true;
    	}
    } 
   
    public boolean deleteRight(Node<T> parent)
    { 
    	if(parent==null)  	return false;
    	else
    	{
       		parent.rChild=null;
    		return true; 		
    	}
    } 
    /**
     * ����ʵ�ֲ���
     * @param node
     */
  //���������������Ҷ�ӽڵ�
  	public void yezi(Node<T> node)
  	{
  		if(node==null) return;
  		else
  		{
  			if (node.lChild==null&&node.rChild==null) {
  	  			System.out.print("Ҷ��:"+node.getData());
  	  			}
  			else{
  				yezi(node.lChild);
  				yezi(node.rChild); 			
  				}  						
  		}  		
  	}
  //ͳ�ƶ��������нڵ������
  	public int count(Node<T> node)
  	{
  		int lc, rc, sum;
		if(node != null)
		{
			lc = count(node.lChild);
			rc = count(node.rChild);
			sum = lc+rc;
			return (sum+1);
		}
		else  return 0;

  	}
  	
    //�ڵ�ǰ�������в�������x
    public Node<T> search(Node<T> node,T x){
    	if(node==null)
    		return null;
    	else{
    		if((node.getData()).equals(x)){
    			return node;
    		}			
    		else{
    			Node<T> s=search(node.lChild,x);
    			if(s!=null)//Ԥ���Һ���ִ�в���
    				return s;
    			else
    				return search(node.rChild,x);
    		}
    	}
    }

    //����node��parent
    public Node<T> search2(Node<T> node,T x){
    	if(node==null)
    		return null;
    	else{
    		if(node.lChild!=null &&(node.lChild.getData()).equals(x)){	
    			return node;
    		}
    		if(node.rChild!=null &&(node.rChild.getData()).equals(x)){	
    			return node;
    		}
    		Node<T> s=search2(node.lChild,x);
    		if(s!=null)
				return s;
			else
				return search2(node.rChild,x);    		
    	}		
    }    
    
    //�������
    public boolean insertl(Node<T> a, Node<T> parent)
	{ 
		if(parent==null)	return false;
		//Node<T> p= new Node<T>(x);
		if(parent.lChild==null) parent.lChild = a;
		else
		{
			insertl(a,parent.lChild);
		}
		return true;
	} 
    //�������
    public boolean insertr(Node<T> a, Node<T> parent)
	{ 
		if(parent==null)	return false;
		//Node<T> p= new Node<T>(x);
		if(parent.rChild==null) parent.rChild = a;
		else
		{
			insertr(a,parent.rChild);
		}
		return true;
	} 
  //������ӡ
  	public void suojing(Node<T> node,int i)
	{	
  		if(node==null)return;			
		else
		{		
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.println(node.getData());
			suojing(node.lChild,++i);
			--i;
			suojing(node.rChild,++i);
			--i;
		}
		
	}
	
	public void inorder(Node<T> node)
	{
		if(node==null) return;
		else
		{
			inorder(node.lChild);
			System.out.print(node.getData());
			inorder(node.rChild);
		}
	}
	public void preorder(Node<T> node)
	{
		if(node==null) return;
		else
		{
			System.out.print(node.getData());
			preorder(node.lChild);
			preorder(node.rChild);
		}
	}
	public void postorder(Node<T> node)
	{
		if(node==null) return;
		else
		{
			postorder(node.lChild);		
			postorder(node.rChild);
			System.out.print(node.getData());
		}
	}
	public void levelorder()
	{
		Node<T>[] queue= new Node[this.maxNodes];
		int front,rear;
		if (this.root==null) return;
		front=-1;
		rear=0;
		queue[rear]=this.root;
		while(front!=rear)
		{
			front++;
			System.out.print(queue[front].getData());    
			
			if (queue[front].lChild!=null)
			{ 
				rear++;
				queue[rear]=queue[front].lChild;
			}
			
			if (queue[front].rChild!=null)
			{
				rear++;
				queue[rear]=queue[front].rChild;
			}
		}
	}
	
	
	
	public void traversal(int i)
	{
		switch(i)
		{
			case 0: preorder(this.root);break;
			case 1: inorder(this.root);break;
			case 2: postorder(this.root);break;
			default: levelorder();	
		}
	}
}