import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>'a'&&'z'>a)
		System.out.print("it is an alphabet");
		else
		System.out.print("it is not an alphabet");
	}
