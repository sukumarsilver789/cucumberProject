package PracticeProgramms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringRevExceptFirstAndLastWord {
	
	public void stringReverseProgram() throws IOException {
		
		//Buffered input is available from the earlier versions of java reads only string
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input String: \n");
		String inputString = reader.readLine();
		
		// Scanner is available from 1.5 and above versions, which can be used to read and convert/parse data
		// into string, int e.t.c
		Scanner scannerInput = new Scanner(System.in);
		System.out.println("scannedInput: \n");
		String scannedInput = scannerInput.nextLine();
		
		System.out.println("Buffer: "+inputString+", scanner: "+scannedInput+"\n");
		
		//String reverse Logic 1 keeping first and last word constant
		String[] splitData = inputString.split(" ");
		
		for(int i=1; i< splitData.length-1; i++) {
			
			String buffer="";
			for(int j=splitData[i].length()-1; j>=0;j--) {
				buffer = buffer+splitData[i].charAt(j);
			}
			splitData[i]=buffer;
		}
		System.out.println("Final Output logic 1:");
		for (int i=0; i<splitData.length;i++)
			System.out.print(splitData[i]+" ");
	}	
}
