import java.util.*;
public class Avgofthreenum{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the number 3: ");
        int n3 = sc.nextInt();
        double avg=(n1+n2+n3)/3;
        System.out.println("The average of numbers is :"+avg);
        sc.close();
    }
}
