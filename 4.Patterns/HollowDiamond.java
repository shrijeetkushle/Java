//    *        
//   * *
//  *   *
// *     *
//  *   *
//   * *
//    *

//code
import java.util.*;
public class HollowDiamond {
public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the Number :");
    int n=sc.nextInt();
    int space=1;
    
    // print i till last row

    for(int i=1;i<=(2*n)-1;i++){
        if(i<=n){

            // print empty spaces till n-i

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        }else{

            // print empty spaces till i-n

            for(int l=1;l<=i-n;l++){
            System.out.print(" ");
            }
        }

        // print one star 

        if(i==1 || i==2*n-1){
            System.out.print("*");
        }else{

        // print two star with spaces 

            System.out.print("*");
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            System.out.print("*");
        if(i<n){
            space+=2;
        }else{
            space-=2;
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
