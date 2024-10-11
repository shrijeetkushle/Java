import java.util.*;
public class AreaofCircle{
    public static void main (String args []){
        System.out.print("Enter the number :");
        Scanner sc=new Scanner (System.in);
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println(area);

    }
}