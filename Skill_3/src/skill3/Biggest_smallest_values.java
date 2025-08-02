package skill3;
import java.util.Scanner;
public class Biggest_smallest_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter size of an array: ");
		  int n=sc.nextInt();
		  int[] arr=new int[n];
		  System.out.println("Enter elements: ");
		  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		  int min=arr[0],max=arr[0];
		  for(int i=0;i<n;i++) {
			  if(arr[i]<min) min=arr[i];
			  if(arr[i]>max) max=arr[i];
		   
		  }
		  System.out.println("Smallest= "+min);
		  System.out.println("Biggest= "+max);
		 }


	}

