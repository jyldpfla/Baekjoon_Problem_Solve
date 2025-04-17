package p2439;

import java.util.Scanner;

public class Main_Others {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = ""; 
		// 1
		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {
				star += j > i ? " " : "*";
			}
			System.out.println(star);
		}
	}
}
