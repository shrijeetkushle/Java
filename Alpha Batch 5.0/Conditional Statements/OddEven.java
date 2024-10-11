import java.util.*;
public class OddEven {
    public static void main (String args []){
        System.out.print("Enter the number :");
        Scanner sc=new Scanner (System.in);
        int number1=sc.nextInt();
        if(number1%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
