import java.util.Scanner;
public class FirstThreeCharacters{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name :");
	String name=sc.nextLine();
	String threeChar=name.substring(0,3);
	System.out.println("your First three characters are:" +threeChar); 
  
  }


}