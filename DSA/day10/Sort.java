
import java.util.Scanner;
	class Sort{
		//int a[] ={61,55,4,87,62,45,95};
		int a[];
	
	void QuickSort(int a[],int low , int high){    // [4,2,3,5] , 0 , 3
		
		if(low<high){
			int j = partition(a,low,high);    // 2
			QuickSort(a,low,j-1);             //    [3,2,4,5] , 0 , 1      j = partition([3,2] , 0, 1) = 1
			QuickSort(a,j+1,high);            //    [3,2,4,5] , 3 , 3
		}
		
	}
	
	
	int partition(int a[],int lb, int ub){     // a, 0 , 3  [4,5,3,2]   ||  [4,2,3,5]
		
		int pivot = a[lb];                     //  pivot = 4
		int start = lb;                       //   start = 0
		int end = ub;                         //   end = 3
		while(start<end){                     //   0<3                   || 1<3                             || 3<3 false  
			                     
			while(a[start]<=pivot){           //  4<=4  true | 5<=4      || 2<=4       | 3<=4      | 5<=4
				start++;                      //  start = 1  | false     || start = 2  | start =3
			}
			while(a[end]>pivot){              //  2>4                    || 5>4       || 3>4
				end--;                        //  false                  || end = 2   || false                             
			}
			
			if(start<end){                   // 1<3 true                 || 3<3
				int temp = a[start];         // temp = a[1] = 5          || false
				a[start] = a[end];           // a[1] = a[3] = 2
				a[end] = temp;               // a[3] = 5            
			}
			
			}
			
			int temp = a[lb];                   // temp = a[0] = 4
				a[lb] = a[end];                 // a[0] = a[2] = 3
				a[end] = temp;                  // a[2] = 4                  [3,2,4,5]
			
			return end;                        // return 2
			
		}
		
		
	
	
	void display(){
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
	
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Sort s = new Sort();
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	s.a = new int [n];
	System.out.print("Enter the elements : ");
		for(int i = 0;i<s.a.length;i++){
		   s.a[i] = sc.nextInt();	
	   
		}
		
		
		
		
		s.QuickSort(s.a,0,s.a.length-1);
	    s.display();
	
	 }
	 
	}