package implementation;

import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        int highestValue = 0;
        int keyforHeighestValue = 0;
        for(int i = 0; i < n; i++){
        	int currentNo = in.nextInt();
        	if(map.containsKey(currentNo)) {
        		//if key already exits, increment the value
        		map.put(currentNo, map.get(currentNo)+1);
        		if(map.get(currentNo)+1 > highestValue) {
        			highestValue = map.get(currentNo)+1;
        			keyforHeighestValue = currentNo;
        		}
        		if(map.get(currentNo)+1 == highestValue) {
        			if(currentNo < keyforHeighestValue) {
        				keyforHeighestValue = currentNo;
        			}
        		}
        	}
        	else {
        		map.put(currentNo, 1);
        	}
        }
        System.out.println(keyforHeighestValue);
        
	}


}
