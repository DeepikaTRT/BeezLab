import java.util.*;
import java.io.*;
public class MyFourthProgram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Strt_range = sc.nextInt();
		int End_range = sc.nextInt();
		int count=0;

		for(int i=Strt_range; i<=End_range; i=i*10){
			int div = i*10;
			count += (End_range/div)*i + Math.min(Math.max(End_range%div-i +1, 0), i);
		}
		System.out.println(count);
	}
}