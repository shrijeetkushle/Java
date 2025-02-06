// Pattern Shape
// 1
// 2 3
// 4 5 6
// 7 8 9 10

//code
import java.util.*;
public class Floyds_Triangle {
public static void main (String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the Number :");
    int n=sc.nextInt();
    int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i-j>=0){
                System.out.print(num+" ");
                num++;
            }
        }
        System.out.println();
      } 
      sc.close();  
    }
}
