// Pattern Shape
// 1
// 1 2
// 1 2 3
// 1 2 3 4

//code
import java.util.*;
public class CountTriangle {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j>=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }  
}
