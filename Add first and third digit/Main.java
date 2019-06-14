import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int num;
      
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      int temp1=num;
      int lastdigit1=temp1%10;
      temp1=temp1/10;
     int temp2=temp1;
      int lastdigit2=temp2%10;
      temp2=temp2/10;
     int temp3=temp2;
      int lastdigit3=temp3%10;
      int sum=lastdigit1+lastdigit3;
      System.out.print(sum);
	}
}