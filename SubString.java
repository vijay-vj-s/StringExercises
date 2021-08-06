import java.util.Scanner;
 public class SubString{
 
    public static void main(String[]args){
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the name");
	   String name=sc.nextLine();
	  int length=name.length();
	  String s=name.substring(length-5);
	    System.out.println("SubString of the given String is :"+s);
	
	}
 
 }