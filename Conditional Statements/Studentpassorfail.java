import java.util.*;
public class Studentpassorfail {
    public static void main (String  args []){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter marks :");
        int marks=sc.nextInt();
        String rc=(marks>=33)?"pass":"Fail";
        System.out.println(rc);
    }
    
}
