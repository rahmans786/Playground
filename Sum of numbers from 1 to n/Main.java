import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n;int i,s=0;
      n=in.nextInt();
      for(i=1;i<=n;i++)
        s=s+i;
      System.out.println(s);
        
	}
}