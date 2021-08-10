import java.util.Scanner;
import java.util.Arrays;
public class StringArray{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String string=sc.nextLine();
	String array[]=string.split(" ");
	System.out.println(Arrays.toString(array));	  
	}
}
