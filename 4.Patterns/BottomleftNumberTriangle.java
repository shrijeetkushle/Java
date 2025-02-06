//pattern shape
// 1         i-j=0
// 1 2       i-j=1
// 1 2 3     i-j=2
// 1 2 3 4   i-j=3

//code
import java.util.*;
public class BottomleftNumberTriangle{
    //Method -- 1
    public static void Half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Method --2
    public static void BottomleftNumberTriangle(int n){
        for(int i=1;i<=n;i++){
            //i-j>=0
            for(int j=1;j<=n;j++){
                if(i-j>=0){
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        sc.close();
        BottomleftNumberTriangle(n);
        Half_pyramid(n);
    }
}
