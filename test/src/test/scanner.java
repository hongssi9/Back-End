package test;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		String name;
		
		System.out.print("�̸��� �Է��ϼ���");
		name=sc.nextLine();
		System.out.print("����");
		kor=sc.nextInt();
		System.out.print("����");
		eng=sc.nextInt();
		
		System.out.printf("�̸�:%s\n",name);
		System.out.printf("����:%d\n",kor);
		System.out.printf("����:%d\n",eng);
		
		
		
		
	}

}
