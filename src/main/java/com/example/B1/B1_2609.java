package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2609 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
	
	public static int gcd(int a, int b) {
	
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	public static int lcm(int a, int b) {
		
		return a * b / gcd(a, b);
	}
}
