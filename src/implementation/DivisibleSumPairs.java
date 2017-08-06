package implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = divisibleSumPairs2(n, k, ar);
	        System.out.println(result);
	}
	
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
        for(int i=0; i<n-1; i++) {
        	for(int j=i+1; j<n; j++) {        		
        		if((ar[i]+ar[j])% k == 0) {
        			count ++;        			
        		}
        			
        	}        	
        }
        return count;
    }
	
	static int divisibleSumPairs2(int n, int k, int[] ar) {
		// array of length n
		int[] array = new int[k];
		// loop till n
		for(int i =0 ; i<n; i++) {
			int remainder = ar[i]%k;
			array[remainder]++;
			
		}
		int length = array.length;		
		int count = 0;
		if(length%2==0) {
			for(int i = 0; i<length/2; i++) {	
				//check of any are 0, initialize by 1
				if(array[i]==0) array[i]=1;
				if(array[length-i-1]==0) array[length-i-1] = 1;
				count = count+(array[i]*array[length-i-1]);
			}
		}
		else {
			for(int i=1; i<=length/2; i++) {
				//check of any are 0, initialize by 1
				if(array[i]==0) array[i]=1;
				if(array[length-i]==0) array[length-i] = 1;
				count = count+(array[i]*array[length-i]);
			}
			count = count+ (array[0]*(array[0]-1)/2);
		}
		return count;
	}

}
