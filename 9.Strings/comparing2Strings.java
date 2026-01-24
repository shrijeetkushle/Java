import java.util.*;
public class comparing2Strings {
    public static void main (String [] args){
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        //equals fun gives true or false value only
        if(s1.equals(s3)){
            System.out.print("Equals");
        }else{
            System.out.print("Not Equals");
        }
    }
}
