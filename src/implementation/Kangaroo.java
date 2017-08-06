package implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int v1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int v2 = scanner.nextInt();
		
		if(v1==v2) {
			if(x1==x2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else {
			if((x1-x2)%(v2-v1)==0  && (x1-x2)/(v2-v1)>=0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}	
		}
			
	}

}
