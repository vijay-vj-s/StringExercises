import java.util.Scanner;
public class MergeEachString{
	public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of the arrays");
	  int size=sc.nextInt();
	   
	   String[]arrays= new String[size];
	   System.out.println("Enter the Strings " +size +"  :");
	   for(int i=0;i<arrays.length;i++){
		arrays [i]=sc.next();	
	   }
	   String mergeEachString="";
	   for(int i=0;i<arrays.length;i++)
	   {
		   mergeEachString+=arrays[i];
		   mergeEachString+="-";
	   }
	   System.out.println("Your Merge String is :" + mergeEachString);
	}
}