import java.util.*;
public class largestnumber{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number 1 :");
        int number1=sc.nextInt();
        System.out.print("Enter number 2 :");
        int number2=sc.nextInt();
        if(number1>number2){
            System.out.println("Number 1 is the largst");
        }
        else{
            System.out.println("Number 2 is the largst");
        }
    }
}