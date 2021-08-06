import java.util.Scanner;
public class StringStart{
   public static void main(String []args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String name=sc.nextLine();
   
    boolean check=name.startsWith("ent");
	  if(check){
		  System.out.println("your String Starts with ent");
		  
	  }
	  else
		  System.out.println("your String doesn't Starts with ent");
   
   
   }



}