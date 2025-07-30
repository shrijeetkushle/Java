import java.util.*;
public class LargestThreedatatype{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        double c=sc.nextDouble();
        double max=a;
        if(b > max){
            max=b;
        }
        if(c > max){
            max=c;
        }
        System.out.println(max+ " is the max Value");
    }
}