import java.util.*;
public class Square{
    // Method --1
    public static void SquarePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   // Method --2
    public static void Square_Pattern(int n){
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                if(i-j<=0){
                System.out.print("*");
                }else{
                System.out.print(" ");
                }
             }
        System.out.println();
    }
}
public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
    SquarePattern(n);
    Square_Pattern(n);
    }
}
