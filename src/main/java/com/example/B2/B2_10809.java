package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2_10809 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();

		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print(word.indexOf(i) + " ");
		}
	}
}
