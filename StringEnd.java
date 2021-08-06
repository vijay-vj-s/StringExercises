import java.util.Scanner;
public class StringEnd{
   public static void main(String []args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String name=sc.nextLine();
   
    boolean check=name.endsWith("le");
	  if(check){
		  System.out.println("your String ends with le");
		  
	  }
	  else
		  System.out.println("your String doesn't Ends with le");
   
   
   }



}