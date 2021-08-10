import java.util.Scanner;
public class CaseSensitive{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String1");
	String string1=sc.nextLine();
	System.out.println("Enter the String2");
	String string2=sc.nextLine();
	
	if(string1.equals(string2)){
		System.out.println("these are equal ");
	}
	else{
	
		System.out.println("these are not equal");
		
     	}
	
	}



}