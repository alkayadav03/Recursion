import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the number: ");
      int n=sc.nextInt();
      fact(n);
      int ans=fact(n);
        System.out.println("Factorial of " + n + " is: " +ans);
    }
public static int fact(int n){
    if(n==0 || n==1) return 1;
            return n*fact(n-1);
}
}