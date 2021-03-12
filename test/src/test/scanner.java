package test;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		String name;
		
		System.out.print("이름을 입력하세요");
		name=sc.nextLine();
		System.out.print("국어");
		kor=sc.nextInt();
		System.out.print("영어");
		eng=sc.nextInt();
		
		System.out.printf("이름:%s\n",name);
		System.out.printf("국어:%d\n",kor);
		System.out.printf("영어:%d\n",eng);
		
		
		
		
	}

}
