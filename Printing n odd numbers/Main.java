import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      int  num,i, sum=0;
	     Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      for(i=1;i<=num;i++)
     {
       System.out.println (2*i-1);
        sum+=2*i-1;
      }
	}
}