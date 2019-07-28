import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int a,b,c,d=0;
      a=in.nextInt();
      b=a/10;
      c=a%10;
      d=b+c;
      System.out.print(d);
	}
}