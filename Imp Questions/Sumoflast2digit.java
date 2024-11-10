    import java.util.*;
public class Sumoflast2digit {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt();
		num1=Math.abs(num1);
		num2=Math.abs(num2);
		int l1=num1%10;
		int l2=num2%10;
		int sum=l1+l2;
		System.out.println(sum);
		
	}
}
