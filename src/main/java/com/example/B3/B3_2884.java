package com.example.B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2884 {

	public static void main(String[] args) throws Exception {
		// B3_2884
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		if(m < 45) {
			if(h == 0) {
				h = 23;
				sb.append(h).append(' ');
			} else {
				h--;
				sb.append(h).append(' ');
			}
			sb.append(m = 60 - (45 - m));
		} else {
			sb.append(h).append(' ').append(m - 45);
		}
		
		System.out.println(sb);
	}
}
