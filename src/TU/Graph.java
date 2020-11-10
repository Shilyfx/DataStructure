package TU;

import java.util.Scanner;

public class Graph<T> {
	protected final int MAXSIZE=10;
	protected final int MAX=99;
	protected T[] V;
	protected int[][] arcs;
	protected int e;
	protected int n;
	
	
	public Graph(){  //初始化该矩阵
		V=(T[]) new Object[MAXSIZE];
		arcs =new int[MAXSIZE][MAXSIZE];
		
	}
	public void CreateAdj(){   //创建顶点，及其顶点之间的关系
		int i,j,k;
		T v1,v2;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入图的顶点数及边数");
		System.out.println("顶点数 n=");
		n=sc.nextInt();
		System.out.println("边    数 e=");
		e=sc.nextInt();
		System.out.println("请输入图的顶点信息：");
		String str = sc.next();
		for(i=0;i<n;i++){ 								//初始化该矩阵
			V[i]=(T)(Object)str.charAt(i);				//添加顶点
		}
		for(i=0;i<n;i++){								//将顶点之间的关系矩阵全部设为0
				for(j=0;j<n;j++){
					arcs[i][j]=0;
				}
			}
			
		System.out.println("请输入图的边界信息：");
		for(k=0;k<e;k++){
			System.out.println("请输入第"+(k+1)+"条边的两个端点");
			str=sc.next();
			v1=(T)(Object)str.charAt(0);					
			v2=(T)(Object)str.charAt(1);
			i=LocateVex(v1);			//查找这两个顶点的索引值
			j=LocateVex(v2);
			if(i>=0&&j>=0){				//建立关系即将矩阵中0改为1
				arcs[i][j] =1;
				arcs[j][i] =1;
			}
					
		}
	}
	public int LocateVex(T v){			//查找顶点的索引值
		int i;
		for(i=0;i<n;i++){				//遍历所有顶点返回索引值
			if(V[i]==v){
				return i;
			}
		}
		return -1;
	}
	public void DisplayAdjMatrix(){
		int i,j;
		System.out.println("图的临近矩阵表示：");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(" "+arcs[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Graph<Character>G =new Graph<Character>();
		G.CreateAdj();
		G.DisplayAdjMatrix();
		
	}
}
