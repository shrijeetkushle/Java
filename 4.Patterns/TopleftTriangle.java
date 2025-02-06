//Pattern shap
// * * * *  i+j=2
// * * *    i+j=3
// * *      i+j=4
// *        i+j=5

//code
import java.util.*;
public class TopleftTriangle{
    //Method --1
    public static void Inverted_StarPattern(int n){
        for(int i=1;i<=n;i++){
            //n-i+1
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method --2 
    public static void Toplefttriangle(int n){                                                    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //i+j<=n+1
                if(i+j<=n+1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //method --3

    public static void Topleft_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j<=0){
                    System.out.print("*");
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
        Inverted_StarPattern(n);
        Toplefttriangle(n);
        Topleft_triangle(n); 
    }
}