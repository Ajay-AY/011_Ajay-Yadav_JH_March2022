// 3 assign q

	import java.util.Scanner;

  class ReverseArray{
  public static void main(String[]args){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of Array ");
    int n = sc.nextInt();
    int [] arr =  new int [n];
	int arr1[] =  new int [n];
	for(int i =0;i<arr.length;i++){
		System.out.print("arr["+i+"] : ");
		arr[i] = sc.nextInt();
		
	}
	
	for(int j = arr.length-1,i=0;j>=0;j--,i++){
		
		arr1[i] = arr[j];
		
	}
	
	for(int i =0;i<arr1.length;i++){
		System.out.print(arr1[i]+" ");
		
		
	}
   
   }
  
  }