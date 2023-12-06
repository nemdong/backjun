package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_1157 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
		}
		
		int max = -1;
		char ch = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 'A');
			} else if(arr[i] == max) {
				ch = '?';
			}
			
		}
		System.out.println(ch);
	}
}
