import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int ld=0;
      Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
      while(num!=0)
      {
        ld=num%10;
        num=num/10;
      }
      System.out.print(ld);
	}
}