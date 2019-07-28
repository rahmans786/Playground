import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int r,n,rev=0,fd,Id,s;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      Id=n%10;
      while (n>0) {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
      }
      fd=rev%10;
      s=fd+Id;
      System.out.println(s);
	}
}