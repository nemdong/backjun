package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_1110 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = N;
		int cnt = 0;
		
		while(true) {
			int a = result / 10;
			int b = result % 10;
			int c = a + b;
			
			result = (b * 10) + (c % 10);
			cnt++;
			
			if(result == N) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
