//     ****
//    ****
//   ****
//  ****

//code 
import java.util.*;
public class Solid_RhombusPattern {
    public static void SolidRhombus_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(int k=1;k<=n;k++){
                    System.out.print("*");
                }
                System.out.println();
          }
    }
   public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the Number :");
    int n=sc.nextInt();
    SolidRhombus_Pattern(n);
   } 
}