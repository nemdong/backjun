package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_1152 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 * 
		 * System.out.println(st.countTokens());
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String clearLine = line.trim();
		
		int count = clearLine.length();
		int sCount = 0;
		
		if(count == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		for(int i = 0; i < count; i++) {
			char c = clearLine.charAt(i);
			if(c == ' ') {
				sCount++;
			}
		}
		
		int wordCount = sCount + 1;
		System.out.println(wordCount);
	}
}
