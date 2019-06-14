import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int num,ld,rev=0;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    while(num!=0)
    {
      ld=num%10;
      rev=rev*10+ld;
      num=num/10;
    }
    System.out.print(rev);
  }
}