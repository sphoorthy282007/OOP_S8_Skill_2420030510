package skill3;
import java.util.Scanner;
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enetr the size: ");
		  int n=sc.nextInt();
		  int[]arr=new int[n];
		  System.out.println("Enter elemnts: ");
		  for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		  System.out.print("Reversed elemnts: ");
		  for(int i=n-1;i>=0;i--) System.out.print(arr[i]+" ");
	}

}
