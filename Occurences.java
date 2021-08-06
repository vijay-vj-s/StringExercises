import java.util.Scanner;
public class Occurences{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name :");
	String name=sc.nextLine();
	
	
	System.out.println("Enter the Character :");
	char character=sc.next().charAt(0);
	
	char[] ch=name.toCharArray();
	int count = 0;
	for(int i=0;i<ch.length;i++){
		if(name.charAt(i) == character)
			count++;
		
	}
	System.out.println("Occurences of the given character is :"+count);
 
   }

}