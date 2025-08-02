package skill2;
import java.util.Scanner;
public class type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVal = 100;
        long longVal = intVal;    
        float floatVal = longVal;   

        System.out.println("Implicit Type Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to float: " + floatVal);

       
        double doubleVal = 99.99;
        int narrowedInt = (int) doubleVal; 
        char charVal = (char) intVal;      

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("double value: " + doubleVal);
        System.out.println("Converted to int (narrowed): " + narrowedInt);
        System.out.println("int value converted to char: " + charVal);

        
        float f = 130.55f;
        byte b = (byte) f; 

        System.out.println("\nCasting float to byte:");
        System.out.println("float value: " + f);
        System.out.println("Converted to byte (overflow): " + b);

	}

}
