//Write a basic for loop program to print odd numbers lying in range 1 to 10.
//hint: use i = i+2 in syntax, initialize i =1; run till range 10;
import java.util.Scanner;
public class ForLoopProg {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i=1;i<num;i+=2)
		{
			System.out.println(i);
		}
		sc.close();
	}

}
