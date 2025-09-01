import java.util.Scanner;
public class IncDec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
           System.out.println("increasing order: ");
        inc(1,n);
          System.out.println("\n decreasing order: ");
        dec(n);
    }
     public static void inc(int x,int n){
        if(x>n) return;
         inc(x+1,n);
         System.out.print(x+" ");

     }
     public static void dec(int n){
        if(n==0) return;
         dec(n-1);
         System.out.print(n+" ");
     }

}

