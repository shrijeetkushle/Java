//     1      1       
//    121     3
//   12321    5    (2*i)-1
//  1234321   7
// 123454321  9

//code
import java.util.*;
public class half_pyramid{

    // Method -- 1

    public static void halfpyramid (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            //(2*i)-1
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(num);
                if(k<i){
                    num++;
                }
                else{
                    num--;
                }
            }
            System.out.println();
        }
    }

    // Method -- 2

    public static void halfpyramid_Pattern(int n){
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=1;
            boolean increase=true;
            while(num>0){
                System.out.print(num);
                if(num==i){
                    increase=false;
                }if(increase==true){
                    num++;
                }
                else{
                    num--;
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        halfpyramid(n);
        halfpyramid_Pattern(n);

    }
}