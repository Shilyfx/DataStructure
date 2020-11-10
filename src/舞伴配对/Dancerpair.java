package 舞伴配对;

public class Dancerpair {
	public static void main(String[] args) {
		String[] names={"张","王","李","赵","孙","贾"};
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

	public static void  DancePartner(Person []dancer){//数组dancer中存放跳舞的男女
		int i,n=0;
		Person p;
		sequenceQueue<Person> Mdancers=new sequenceQueue<Person>();
		sequenceQueue<Person> Fdancers=new sequenceQueue<Person>();
		for(i=0;i<dancer.length;i++){			//依次将跳舞者依其性别入队
			p=dancer[i];       
			if(p.GetSex()=='F')					//判断性别 分组
				Fdancers.EnQueue(p);			//排入女队	 
			else
				Mdancers.EnQueue(p);			//排入男队	       
		}  
		System.out.println("The dancing partners are:");
		while(n!=Fdancers.size()&& n!=Mdancers.size()){
			n++;
			System.out.println("第"+n+"对舞伴:");
			p=Fdancers.DeQueue();  Fdancers.EnQueue(p);
			System.out.println("女士"+p.GetName());
			p=Mdancers.DeQueue();  Mdancers.EnQueue(p);
			System.out.println("男士"+p.GetName());	    	 
		}
		if(n<Fdancers.size()){
			System.out.println("还有女士几人等待下一轮的舞曲"+(Fdancers.size()-n));
			p=Fdancers.GetHead();
			System.out.println(p.GetName()+" 将是第一个参加下一轮舞曲的女士."); 	    	 
		}
		else   if(n<Mdancers.size()){
			System.out.println("还有男士几人等待下一轮的舞曲."+(Mdancers.size()-n));
			p=Mdancers.GetHead();
			System.out.println(p.GetName()+" 将是第一个参加下一轮舞曲的男士."); 	    	 
		}	
	}
} 
 


