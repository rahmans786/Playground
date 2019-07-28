import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
      int a,b,c=0;
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      if((a>b)&&(a>c))
      {
        System.out.print(a);
      }
      else if((b>a)&&(b>c))
      {
        System.out.print(b);
      }
      else
      {
        System.out.print(c);
      }
    }
}