package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine());
		String amOrPm = str.substring(str.length()-2);
		String hour = str.substring(0, 2);
		// if PM and time is greater than 12---> add 12 to hour
		if((amOrPm).equals("PM") && !hour.equals("12"))	
			hour = Integer.toString(Integer.parseInt(hour)+12);
		// if time is AM and equal to 12 --> make hour to 0.
		else if((amOrPm).equals("AM") && hour.equals("12"))
			hour = "00";

		String output = hour+str.substring(2, str.length()-2);
		System.out.println(output);
	}

}
