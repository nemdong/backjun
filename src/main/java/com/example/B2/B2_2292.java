package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_2292 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int room = 1;
		int cnt = 1;
		
		for(int i = 1; i < N; i++) {
			room += i * 6;
			
			if(N <= room) {
				cnt = i + 1;
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
