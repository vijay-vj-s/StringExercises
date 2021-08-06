import java.util.Scanner;
public class CharArray{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter the name :");
    String name=sc.nextLine();

    char[]character=name.toCharArray();
     System.out.println("character Array is of your name is :");

       for(int i=0;i<character.length;i++){
          System.out.println("-->"+character[i]);
      }
    }
}