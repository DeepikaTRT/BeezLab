import java.util.*;
public class MySecondProgram{
	public static void main(String[] args) {
		int arr[] = {1,7,9,8,5,3,6,4};
		int k=1,flag=0;
		for(int i=2;i<=(arr.length+1);i++){
			k+=i;
			k-=arr[i-2];
		}
		System.out.println(k);
	}
}