import java.util.Scanner;
public class PowerLinear{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("base: ");
      int a=sc.nextInt();
      System.out.print("exponent: ");
      int b=sc.nextInt();
  System.out.print(a+" raised to the power "+b+" is "+pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call=pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}