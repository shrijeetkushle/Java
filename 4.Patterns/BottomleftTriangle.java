// Pattern shap
// *          i-j=0
// * *        i-j=1
// * * *      i-j=2
// * * * *    i=j=3

//code
import java.util.*;
public class BottomleftTriangle {
    //Method -- 1
    public static void StarPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //method -- 2
    public static void BottomleftTriangle(int n){
        for(int i=1;i<=n;i++){
            //i-j>=0
            for(int j=1;j<=n;j++){
                if(i-j>=0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        StarPattern(n);
        BottomleftTriangle(n);
    }
}
