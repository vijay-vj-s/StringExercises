import java.util.Scanner;
public class Penultimate{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name");
     String name=sc.nextLine();
     int Len=name.length();
	 char Penultimate=name.charAt(Len-2);
    System.out.println("the Penultimate of the String is :"+ Penultimate); 
   }
}