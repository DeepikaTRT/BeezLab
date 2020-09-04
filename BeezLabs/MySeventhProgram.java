import java.util.*;
public class MySeventhProgram{
	static void Sum(int N){
		int sum=0;
		if(N<10){
			System.out.println(N);
		}
		else{
			while(N>0){
				sum=sum+N%10;
				N/=10;
			}
			Sum(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		Sum(num);
	}
}