package skill2;
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

   
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

       
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = a: " + c);
        c += b;
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= b;
        System.out.println("c *= b: " + c);
        c /= b;
        System.out.println("c /= b: " + c);

       
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("--d = " + (--d));
        System.out.println("d++ = " + (d++));
        System.out.println("d-- = " + (d--));
        System.out.println("After post increments, d = " + d);

        
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

	}

}
