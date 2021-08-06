import java.util.Scanner;
public class ToUpperCase{
	  public static void main(String[]args){
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter the name");
		  String name=sc.nextLine();
		  
		  String upper=name.toUpperCase();
		  System.out.println("the uppercase of the name is :" + upper);
		  
		  
		  
		  
	  }
	  
	
	
	
}