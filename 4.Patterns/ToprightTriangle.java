//pattern shape
// * * * *  i-j=-3
//   * * *  i-j=-2
//     * *  i-j=-1
//       *  i-j=0

//code
import java.util.*;
public class ToprightTriangle {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j<=0){
                    System.out.print("*");
                }
            else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
