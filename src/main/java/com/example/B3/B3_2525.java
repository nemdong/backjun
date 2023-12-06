package com.example.B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2525 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int T = Integer.parseInt(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if((M + T) < 60) {
			System.out.println(H + " " + (M + T));
		} else {
			int h = (M + T) / 60;
			int l = (M + T) % 60;
			if(H + h >= 24) {
				System.out.println((H + h) % 24 + " " + l);
			} else {
				System.out.println((H + h) + " " + l);
			}
		}
	}
}
