import java.util.*;
public class BottomleftNumberTriangle{
    //Method -- 1
    public static void Half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Method --2
    public static void BottomleftNumberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        //BottomleftNumberTriangle(n);
        Half_pyramid(n);
    }
}