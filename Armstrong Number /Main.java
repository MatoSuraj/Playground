import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      int count=0,sum=0;
	   Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp1=num;
      while(temp1!=0)
      {
        count++;
        temp1=temp1/10;
      }
      int temp2=num;
      while(temp2!=0)
      {
        int ld=temp2%10;
        sum=sum+(int)(Math.pow(ld,count));
        temp2=temp2/10;
      }
      if(num==sum)
      {
      System.out.println("Armstrong Number");
      }
      else
      {
         System.out.println("Not a Armstrong Number");
      }
        
	}
}