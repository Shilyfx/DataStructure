package ������;

public class Dancerpair {
	public static void main(String[] args) {
		String[] names={"��","��","��","��","��","��"};
		char[] sexs={'F','M','M','F','M','M'};
		Person p1=new Person();
		Person[] dancers=new Person[6];
	    for(int i=0;i<names.length;i++){
	    	dancers[i]=new Person(names[i],sexs[i]);	    	
	    	dancers[i].SetName(names[i]);
	    	dancers[i].SetSex(sexs[i]);
	    }
	    DancePartner(dancers);	

	}

	public static void  DancePartner(Person []dancer){//����dancer�д���������Ů
		int i,n=0;
		Person p;
		sequenceQueue<Person> Mdancers=new sequenceQueue<Person>();
		sequenceQueue<Person> Fdancers=new sequenceQueue<Person>();
		for(i=0;i<dancer.length;i++){			//���ν������������Ա����
			p=dancer[i];       
			if(p.GetSex()=='F')					//�ж��Ա� ����
				Fdancers.EnQueue(p);			//����Ů��	 
			else
				Mdancers.EnQueue(p);			//�����ж�	       
		}  
		System.out.println("The dancing partners are:");
		while(n!=Fdancers.size()&& n!=Mdancers.size()){
			n++;
			System.out.println("��"+n+"�����:");
			p=Fdancers.DeQueue();  Fdancers.EnQueue(p);
			System.out.println("Ůʿ"+p.GetName());
			p=Mdancers.DeQueue();  Mdancers.EnQueue(p);
			System.out.println("��ʿ"+p.GetName());	    	 
		}
		if(n<Fdancers.size()){
			System.out.println("����Ůʿ���˵ȴ���һ�ֵ�����"+(Fdancers.size()-n));
			p=Fdancers.GetHead();
			System.out.println(p.GetName()+" ���ǵ�һ���μ���һ��������Ůʿ."); 	    	 
		}
		else   if(n<Mdancers.size()){
			System.out.println("������ʿ���˵ȴ���һ�ֵ�����."+(Mdancers.size()-n));
			p=Mdancers.GetHead();
			System.out.println(p.GetName()+" ���ǵ�һ���μ���һ����������ʿ."); 	    	 
		}	
	}
} 
 


