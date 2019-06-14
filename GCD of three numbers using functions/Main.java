import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_two_numbers(n1, n2);
	    System.out.print(gcd_of_two_numbers(n1, n2));
	}
	public static int gcd_of_two_numbers(int num1, int num2)
	{
	    int min_num;
	    if(num1 < num2)
	    {
	        min_num = num1;
	    }
	    else
        {
	        min_num = num2;
	    }
	    while(min_num >= 1)
	    {
	        if((num1 % min_num == 0) &&(num2 % min_num == 0))
	        {
	            return min_num;
	        }
	        --min_num;
	    }
	    return 0;
	}
}