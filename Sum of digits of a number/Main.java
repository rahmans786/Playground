import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    long n,sum;
      Scanner in=new Scanner(System.in);
      n=in.nextLong();
      for(sum=0;n!=0;n/=10)
      {
        sum+=n%10;
      }
      System.out.println(sum);
	}
}