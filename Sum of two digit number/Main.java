import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int sum=0;
      Scanner sc=new Scanner(System.in);
    int  num=sc.nextInt();
      while(num!=0)
      {
       int ld=num%10;
         sum=sum+ld;
        num=num/10;
      }
      System.out.print(sum);
	}
}