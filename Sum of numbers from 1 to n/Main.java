import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int sum=0;
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      for(int i=1;i<=num;i++)
      {
        sum=sum+i;
      }
      System.out.print(sum);
	}
}