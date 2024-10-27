import java.util.*;
public class shrijeet{
    public static void largest(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+curr+","+num[j]+")");
            }
    }
}
println
    public static void main (String args []){
        int arr[]={1,2,3,4,5};
        largest(arr);
    }
}