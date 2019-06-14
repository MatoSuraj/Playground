import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int fact=1,sum=0,ld,i;
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp=num;
     while(temp!=0)
      {
        ld=temp%10;
         fact=1;
       for(i=1;i<=ld;i++)
       {
       
        fact=fact*i;
       }
        sum=sum+fact;
        temp=temp/10;
      }
      if(num==sum)
      {
      System.out.println("Yes");
      }
      else
        {
      System.out.println("No");
      }
	}
}