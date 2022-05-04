import java.util.*;

class TowerOfHonai{
			static void tower(int n,char source,char intermidiate,char destination){
				
				if(n==1)
					System.out.println("Disk from "+source+" to "+destination);
				else{
					tower(n-1,source,destination,intermidiate);
					System.out.println("Disk from "+source+" to "+destination);
					tower(n-1,intermidiate,source,destination);
				}
			}

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter number for TOH:");
			int n=3;
			
			tower(n,'A','B','C');

}

}// for 1  a->c

//for 2    a->b , a->c , b->c

// for 3   a->c , a->b , c->b , a->c , b->a , b->c , a->c