import java.util.Scanner;
class Main
{
  static int display(int x,int y)
  {
    return (int)Math.pow(x,y);
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(display(x,y));
  }
}