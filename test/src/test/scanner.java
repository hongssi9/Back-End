package test;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		int kor, math, eng, total;
		double avg;
		Scanner sc = new Scanner(System.in); //System.in�� ȭ�鿡�� ����� �ްڴٴ� ��.
		
		System.out.println("-----------���� �Է�-------------");
		System.out.println("��������");
		kor = sc.nextInt();
		System.out.println("��������");
		math = sc.nextInt();
		System.out.println("��������");
		eng = sc.nextInt();
		
		total = kor+math+eng;
		avg = total/3;
		
		
		System.out.println("-----------���� ���-------------");
		System.out.printf("�������� : %d",kor);
		System.out.printf("�������� : %d",math);
		System.out.printf("�������� : %d",eng);
		System.out.printf("���� : %d",total);
		System.out.printf("��� : %s",avg);
		
		
		
		
		
		
	
		
		
		
	}

}
