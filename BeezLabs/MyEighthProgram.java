import java.util.*;
public class MyEighthProgram{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Students : ");
		int N = sc.nextInt();
		for(int i=1;i<=N;i++){
			System.out.printf("Enter the %d student quarterly marks:\n",i);
			System.out.print("English --");
			int English= sc.nextInt();
			System.out.print("Tamil -"); 
			int Tamil= sc.nextInt();
			System.out.print("Maths -");
			int Maths= sc.nextInt();
			System.out.print("Science -");
			int Science= sc.nextInt();
			System.out.print("Social Science --");
			int Social_Science= sc.nextInt();

			System.out.printf("Enter the %d student half yearly marks:\n",i);
			System.out.print("English --");
			int English1= sc.nextInt();
			System.out.print("Tamil -"); 
			int Tamil1= sc.nextInt();
			System.out.print("Maths -");
			int Maths1= sc.nextInt();
			System.out.print("Science -");
			int Science1= sc.nextInt();
			System.out.print("Social Science --");
			int Social_Science1= sc.nextInt();

			System.out.printf("Average of %d student:\n",i);
			System.out.println("English -"+(float)(English+English1)/2.0);
			System.out.println("Tamil -"+(float)(Tamil+Tamil1)/2.0); 
			System.out.println("Maths -"+(float)(Maths+Maths1)/2.0);
			System.out.println("Science -"+(float)(Science+Science1)/2.0);
			System.out.println("Social Science -"+(float)(Social_Science+Social_Science1)/2.0);
		}
	}
}