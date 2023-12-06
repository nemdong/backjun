package com.example.B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3_2562 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
