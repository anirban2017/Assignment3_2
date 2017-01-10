package Assignment3_2;
import java.util.Scanner;

public class Assignment3_2 {
	public static void main(String s[])
	{
	String S1,S2;
	boolean same=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the string S1:-");
	S1=sc.nextLine();
	System.out.println("Please enter the string S2:-");
	S2=sc.nextLine();
	if(S1.equals(S2))
	{
	same=true;
	System.out.println(same);
	}
	else
	{
	System.out.println(same);
	}

}
}
