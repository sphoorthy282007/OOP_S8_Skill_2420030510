package skill3;
import java.util.Scanner;
public class sort_using_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter array size: ");
		  int n=sc.nextInt();
		  int[]arr=new int[n];
		  System.out.print("Enter the elements: ");
		  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		  
		  for(int i=0;i<n-1;i++) {
		   for(int j=0;j<n-i-1;j++) {
		    if(arr[j]>arr[j+1]) {
		     int temp=arr[j];
		     arr[j]=arr[j+1];
		     arr[j+1]=temp;
		     
		    }
		   }
		  }
		  System.out.print("Sorted array : ");
		  for(int i=0;i<n;i++) {
		   System.out.print(arr[i]+" ");
		  }


	}

}
