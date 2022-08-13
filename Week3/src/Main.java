import java.util.Scanner;
public class Main
{

	Scanner sc = new Scanner(System.in);
	//function to checkPalindrome
	public void checkPalindrome() 
    {
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println();
		if(num<0)
		{
			System.out.println("Enter a number Greater than 0");
			checkPalindrome();
		}
		else
		{
			int temp=num;
			int rev=0,rem;
			while(temp>0)
			{
				rem=temp%10;
				rev=(10*rev) + rem;
				temp=temp/10;
			}
			if(num == rev)
			{
				System.out.println("Is A Palindrome");
			}
			else
			{
				System.out.println("Is Not A Palindrome");
			}
		}
		System.out.println();
		
    }	
	//function to printPattern

	public void printPattern()
	{
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println();
		if(num<0)
		{
			System.out.println("Enter a number Greater than 0");
			printPattern();
		}
		else
		{
			for(int i=num;i>0;i--)
			{
				for(int j=i;j>0;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
	}
	//function to check no is prime or not
	public void checkPrimeNumber()
	{
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println();
		if(num<0)
		{
			System.out.println("Enter a number Greater than 0");
			checkPrimeNumber();
		}
		else
		{
			int temp=0;
			if(num==0 || num == 1)
			{
				System.out.println("Is A Prime Number");
			}
			else
			{
				for(int i=2 ;i < num/2; i++)
				{
					if(num%i == 0)
					{
						temp=1;
						break;
					}
				}
				if(temp==1)
				{
					System.out.println("Is NOT A Prime Number");
				}
				else
				{
					System.out.println("Is A Prime Number");
				}
			}
		}
		System.out.println();
		
	}


	// function to print Fibonacci Series
	public void printFibonacciSeries() 
	{
		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println();
		if(num<0)
		{
			System.out.println("Enter a number Greater than 0");
			printFibonacciSeries();
			System.out.println();
		}
		else
		{
			System.out.print(first+", "+second);
			for(int i=2;i<=num;i++)
			{
				int temp = first + second;
				System.out.print(", "+temp);
				first=second;
				second=temp;
			}
		}
		System.out.println();
	}
	//main method which contains switch and do while loop
	public static void main(String[] args)
	{

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);
                do {

                	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

                	System.out.println();
                	choice = sc.nextInt();

                	switch (choice)
                	{
                	case 0:
                		choice = 0;
                		break;

                	case 1:{
                		obj.checkPalindrome();
                	}
                		break;
                	case 2: {
                		obj.printPattern();
                		}
                	break;
                	case 3:
                	{
                		obj.checkPrimeNumber();
                	}
                	break;
                	case 4:
                	{
                		obj.printFibonacciSeries();
                	}
                	break;
                	default:
                		System.out.println("Invalid choice. Enter a valid no.\n");
                	}
                }while (choice != 0);

                System.out.println("Exited Successfully!!!");

                sc.close();

	}


}