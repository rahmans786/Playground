import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
        int a,b=0;
      a=in.nextInt();
      b=in.nextInt();
      if(a>b)
      {
        System.out.println( "num1 is the greatest number");
      }
      else
      {
        System.out.println("num2 is the greatest number");
      }
	}
}