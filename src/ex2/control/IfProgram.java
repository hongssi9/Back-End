package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//1. ����ڷκ��� ���� ���� �Է� �޾Ƽ� ���� x�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("������ �Է��Ͻÿ�",sc);
		int x = sc.nextInt();
		
		
		//1-1 ���� �� ���� 3���� ũ�� "ū ��" �̶�� ���ڿ��� ����Ѵ�.
	    if( x % 2 == 0) {
	    	System.out.print("¦��");
	    System.out.println(" ��");
	    }
	    if ( x % 2 == 1) {
	    System.out.print("Ȧ��");
	    System.out.println(" ��");
	    }
	    System.out.println("���α׷� ��!");
	    
		
		
	}

}
