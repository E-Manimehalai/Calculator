package Tasks;
import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double a,b;
		int op;
		while(true)
		{
			System.out.println("Choose operation.. \n1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
			op=sc.nextInt();
			if(op==5)
			{
				System.out.println("Exiting Calculator!!!");
				System.exit(0);
			}
			System.out.println("Enter Any Two numbers:");
			a=sc.nextDouble();
			b=sc.nextDouble();
			switch(op)
			{
			case 1: add(a,b);
					break;
			case 2: sub(a,b);
					break;
			case 3: mul(a, b);
					break;
            case 4: div(a, b);
                    break;
			default: System.out.println("Invalid Choice!!!");
			}
		}
		
	}
	
	static void add(double a,double b)
	{
		double c=a+b;
		System.out.println("Addition of two number is: " +c);
	}
	static void sub(double a,double b)
	{
		double c=a-b;
		System.out.println("Subtraction of two number is: " +c);
	}
	static void mul(double a, double b) {
		double c = a * b;
        System.out.println("Multiplication of two numbers is: " + c);
    }

    static void div(double a, double b) {
        if (b == 0) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        else 
        {
            double c = a / b;
            System.out.println("Division of two numbers is: " + c);
        }
    }
}
