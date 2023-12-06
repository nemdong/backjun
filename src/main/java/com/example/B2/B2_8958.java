package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_8958 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				
				sum += count;
			}
			
			System.out.println(sum);
		}
		
		
	}

}
