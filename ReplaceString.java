package com.btm.prog.string;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ss="Hello UserName, How are you?";
		System.out.println(ss);
		System.out.println("you have to replace <<UserName>> with your name.");
		System.out.println("now enter your name.");
		String st=s.next();
		while (st.length()<3){
			System.out.println("again enter your name");
			st=s.next();
		}
		String word="",sent=""; int count=0; char c=' ', ch=',';
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i)==c) {
				if (count==1) {
					sent=sent+st+ch;
				}else {
					sent=sent+word+c;
				}
				word=""; count++;
			} else {
				word=word+ss.charAt(i);
			}
		}
		sent=sent+word+c;
		System.out.println(sent);
	}

}
