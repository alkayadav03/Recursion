import java.util.Scanner;
public class NToOne{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the number");
      int n=sc.nextInt();
      print(n);  
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}