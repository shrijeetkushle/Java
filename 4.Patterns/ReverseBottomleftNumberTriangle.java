import java.util.*;
public class ReverseBottomleftNumberTriangle {
    // Method -- 1
    public static void InvertedStar_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Method -- 2
    public static void ReverseBottomleftNumberTriangle(int n){
         for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();  
        sc.close();
        InvertedStar_Pattern(n);
        ReverseBottomleftNumberTriangle(n);
    }
}
