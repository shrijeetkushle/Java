// Pattern Shape
// * * * *  i=1
// * * * *  i=2
// * * * *  i=3
// * * * *  i=4

//code
import java.util.*;
public class Square{
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                System.out.print("*");
             }
             System.out.println();
            }
        sc.close();
    }
}
