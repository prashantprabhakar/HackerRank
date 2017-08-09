package implementation;

import java.util.Scanner;

public class BonAppétit {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int sum = 0;
	        for(int i =0; i<n ; i++) {
	        	int currentItemPrice = in.nextInt();
	        	if(i==k)
	        		continue;
	        	else {
	        		sum += currentItemPrice;
	        	}
	        }
	        int b = in.nextInt();
	        if(b== sum/2)
	        	System.out.println("Bon Appetit");
	        else
	        	System.out.println(b- sum/2);

	}

}
