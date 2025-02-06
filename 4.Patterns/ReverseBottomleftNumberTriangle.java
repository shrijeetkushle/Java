// Pattern shape 
// 4
// 4 3
// 4 3 2
// 4 3 2 1

//code
import java.util.*;
public class ReverseBottomleftNumberTriangle {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
            
    }
}
