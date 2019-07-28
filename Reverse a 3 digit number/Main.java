import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n,a,b,c,s=0;
    n=in.nextInt();
    a=n/100;
    b=((n/10)%10);
    c=n%10;
    s=c*100+b*10+a;
    System.out.print(s);
  }
}