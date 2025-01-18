import java.util.*;
public class Leapyear{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        if(num%4==0 && num%100!=0 || num%400==0){
            System.out.println("leap year");
        }
    else{
        System.out.println("Not a leap year");
    }
      sc.close();
    }
}