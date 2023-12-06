package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_11653 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= N; i++) {
			if(N % i == 0) {
				N = N / i;
				
				System.out.println(i);
				
				i--;
			} 
		}
		
		
		
		/*
		int i = 2;
		
		while(N != 0) {
			if(N == 1) {
				break;
			}
			
			if(N % i == 0) {
				N = N / i;
				
				System.out.println(i);
			} else {
				i++;
			}
		}
		*/
		
	}

}
