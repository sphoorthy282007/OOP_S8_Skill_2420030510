package skill3;
import java.util.Scanner;
public class sum_average_array_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter size of array: ");
		  int n=sc.nextInt();
		  int []arr=new int[n];
		  int sum=0;
		  System.out.println("Enter elemnts: ");
		  for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
		   sum+=arr[i];
		  }
		  int avg=sum/n;
		  System.out.println("Sum= "+sum);
		  System.out.println("Average= "+avg);
	}

}
