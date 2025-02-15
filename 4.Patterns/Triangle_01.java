// 1
// 0 1
// 1 0 1
// 0 1 0 1

//code
import java.util.*;
public class Triangle_01{
        public static void Triangle01(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                        if((i+j)%2==0){
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
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
        Triangle01(n);
    }
}
