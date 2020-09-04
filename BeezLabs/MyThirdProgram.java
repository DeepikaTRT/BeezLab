import java.util.*;
public class MyThirdProgram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 and num2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.printf("Before Swapping\nnum1 = %d\nnum2 = %d\n",num1,num2);
		System.out.printf("After Swapping without a third variable\nnum1 = %d\nnum2 = %d",num2,num1);
	}
}