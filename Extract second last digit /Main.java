import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int a,b=0;
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      b=(a%100)/10;
      System.out.print(b);
	}
}