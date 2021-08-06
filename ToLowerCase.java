import java.util.Scanner;
public class ToLowerCase{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
			String name=sc.nextLine();
       		String lower=name.toLowerCase();
		System.out.println("the LowerCase of your name is :"+lower);
		
		
	}
	
	
}