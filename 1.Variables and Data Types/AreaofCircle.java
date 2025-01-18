import java.util.*;
public class AreaofCircle{
    public static void main (String[] args){
        System.out.print("Enter the radius of the circle :");
        Scanner sc=new Scanner (System.in);
        float rad=sc.nextFloat();
        //PI=3.14
        double area=Math.PI*rad*rad;
        System.out.println(" The Area of circle is + "+area);

        sc.close();
    }
    
}
