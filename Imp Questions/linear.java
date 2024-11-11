import java.util.*;
public class linear {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int arr[]={1,4,3,2,5};
        int key=1;
        int index=linear(arr,key);
        if(index==key){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at Index :"+index);
        }
    }
}
