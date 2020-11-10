package TU;

import java.util.Scanner;

public class Graph<T> {
	protected final int MAXSIZE=10;
	protected final int MAX=99;
	protected T[] V;
	protected int[][] arcs;
	protected int e;
	protected int n;
	
	
	public Graph(){  //��ʼ���þ���
		V=(T[]) new Object[MAXSIZE];
		arcs =new int[MAXSIZE][MAXSIZE];
		
	}
	public void CreateAdj(){   //�������㣬���䶥��֮��Ĺ�ϵ
		int i,j,k;
		T v1,v2;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ͼ�Ķ�����������");
		System.out.println("������ n=");
		n=sc.nextInt();
		System.out.println("��    �� e=");
		e=sc.nextInt();
		System.out.println("������ͼ�Ķ�����Ϣ��");
		String str = sc.next();
		for(i=0;i<n;i++){ 								//��ʼ���þ���
			V[i]=(T)(Object)str.charAt(i);				//��Ӷ���
		}
		for(i=0;i<n;i++){								//������֮��Ĺ�ϵ����ȫ����Ϊ0
				for(j=0;j<n;j++){
					arcs[i][j]=0;
				}
			}
			
		System.out.println("������ͼ�ı߽���Ϣ��");
		for(k=0;k<e;k++){
			System.out.println("�������"+(k+1)+"���ߵ������˵�");
			str=sc.next();
			v1=(T)(Object)str.charAt(0);					
			v2=(T)(Object)str.charAt(1);
			i=LocateVex(v1);			//�������������������ֵ
			j=LocateVex(v2);
			if(i>=0&&j>=0){				//������ϵ����������0��Ϊ1
				arcs[i][j] =1;
				arcs[j][i] =1;
			}
					
		}
	}
	public int LocateVex(T v){			//���Ҷ��������ֵ
		int i;
		for(i=0;i<n;i++){				//�������ж��㷵������ֵ
			if(V[i]==v){
				return i;
			}
		}
		return -1;
	}
	public void DisplayAdjMatrix(){
		int i,j;
		System.out.println("ͼ���ٽ������ʾ��");
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
