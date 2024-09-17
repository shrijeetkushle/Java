import java.util.*;
public class ProductCalculator{
    public static void product(int num1,int num2){
        int prod=num1*num2;
        System.out.println(prod);
    }
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        product(a,b);
    }
}