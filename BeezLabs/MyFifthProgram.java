import java.util.*;
import java.io.*;
public class MyFifthProgram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date Starting_date = new Date();
		Date Ending_date = new Date();
		int count=0;
		for(Date d=Starting_date; d<Ending_date; d.add(Calendar.DATE, 1)){
			int day = d.getDay();
			if(day == 0 || day == 6){
				count++;
			}
		}
		System.out.println(count);
	}
} 