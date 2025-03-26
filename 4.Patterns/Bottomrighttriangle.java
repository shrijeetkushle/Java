//Pattern shap
//      *   i+j=5
//    * *   i+j=6
//  * * *   i+j=7
//* * * *   i+j=8

//code
import java.util.*;
public class Bottomrighttriangle {

    // Method -- 1
    public static void InvertedandRotatedhalf_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Method -- 2

    public static void Bottomright_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //i+j>=n+1
                if(i+j>=n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }

    //method -- 3

    public static void Rotatedhalf_Pyramid(int n){
        for(int i=1;i<=n;i++){
            // n-i to print the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        Bottomright_triangle(n);
        InvertedandRotatedhalf_Pyramid(n);
        Rotatedhalf_Pyramid(n);
        sc.close();
        
    }
}
