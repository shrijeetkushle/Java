import java.util.*;
public class Largestofthreenumber{
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number 1:");
        int number1=sc.nextInt();
        System.out.print("Enter number 2:");
        int number2=sc.nextInt();
        System.out.print("Enter number 3:");
        int number3=sc.nextInt();
        if((number1>=number2) && (number1>=number3)){
            System.out.println("Number one is the largst");

        }
        else if(number2 >= number3){ 
            System.out.println("number 2");
        }
        else{
            System.out.println("C is the largst");
        }
    }
}