package implementation;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);        
        in.close();

	}
	
	static int getTotalX(int[] a, int[] b) {
        int lcmOfNos = lcm(a);
        int hcfOfNos = hcf(b);
        int count = 0;
        int x = lcmOfNos;
        while(lcmOfNos<= hcfOfNos) {
        	if(hcfOfNos % lcmOfNos == 0 ) {
        		count++;        		
        	}
        	lcmOfNos += x;
        }
        return count;
    }
	
	static int lcm(int[] a) {
		int result = a [0];
		for(int i=1; i<a.length; i++) {
			result = lcm (result, a[i]);
		}
		return result;
	}
	
    static int lcm(int a , int b) {
    	int result = hcf(a,b);
    	return (a*b/result);
    }
    
    static int hcf(int[] b) {
    	int result = b[0];
    	for(int i=1 ; i<b.length; i++) {
    		result = hcf(result, b[i]);
    	}
    	return result;
    }
    
    static int hcf(int a, int b) {
    	int result = 1;
    	for(int i=1; i<=a && i<=b; i++) {
    		if(a%i==0 && b%i==0)
    			result = i;
    	}
    	return result;
    }
	

}
