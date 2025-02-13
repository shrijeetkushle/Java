// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

//code
import java.util.*;
public class InvertedHalf_PyramidwithNumber {

    // Method -- 1
    public static void InvertedHalf_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // method -- 2
    public static void InvertedHalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method -- 3

    public static void Inverted_HalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if (i-j>=0) {
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
    InvertedHalfPyramid(n);
    InvertedHalf_Pyramid(n);
    Inverted_HalfPyramid(n);
    
  }
}
