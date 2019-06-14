import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner ( System.in);
      int num=sc.nextInt();
      int ld1=num%10;
      num=num/10;
      int ld2=num%10;
      System.out.print(ld2);
	}
}