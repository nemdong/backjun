package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_2577 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A * B * C;
		
		String str = Integer.toString(result);
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0' == i)) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}
}
