import java.util.*;
public class Costofitem {
    public static void main (String args []){
        Scanner sc=new Scanner (System.in);
        float pen=sc.nextFloat();
        float pencile=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencile+eraser;
        System.out.printf("Total bill is : %.2f\n",total);
        float totalgst=total*0.18f;
        System.out.printf("Total gst is : %.2f\n",totalgst);
        float newtotal=totalgst+total;
        System.out.printf("Overall bill is : %.2f\n",newtotal);

    }
    
}
