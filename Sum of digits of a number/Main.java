import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      int ld,sum=0;
	   Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      while(num!=0)
      {
        ld=num%10;
        sum=sum+ld;
        num=num/10;
      }
       System.out.println(sum);
	}
     
}