package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class covid {

	public static void main(String[] args) throws IOException {

		// 4��° �÷��� �� ���� ���Ͻÿ�. -> "���� �˻������ڼ�" �÷��� �� ���� ���Ͻÿ�.(����)

		// ���� �����ϴ� ���� : ������ - Value Type �⺻����
		// ������ �ϴ� ���� : �������� - Ref Type �⺻������ �ƴ� ���

		// �� ������ ���� ����
		// ������ - ��� ������ ������ ����
		// ���� ������ ���� ������ ������ ��ü�� ����Ű�� ���� ����

		// int x = 3;
		// String s = "hello"; //->new String("hello");

		// ������ ���ڿ���
//		String.valueOf(28); // ->"28"
//		String.format("[%d]", 28); // ->"[28]"

		// ���ڿ��� ������ : Wrapper Ŭ������ �̿��Ѵ�.
//	      int = Integer;
//	      double = Double;
//	      float = Float;
//	      char = Char
//	      boolean = Boolean

//		Integer.parseInt("28"); // ->28
//		Double.parseDouble("29.34"); // ->29.34

		FileInputStream fis = new FileInputStream("res/covid.txt"); 
		Scanner scan = new Scanner(fis); //

		int total = 0; //���̰��� ����ϱ� 0���� �ʱ�ȭ

		String line = scan.nextLine();// nextLine()���� �����͸� �������µ� ���͸� ġ�� ���������� �����̶�� �Է¹޴´�.
										// 1.txt���� ������ ���� �о�´�
										// scan.nextLine() -> ������ ���´�.

		while (scan.hasNextLine()) { // hasNextLine()�� ������ ���� ���� �ִ��� Ȯ���ϴ� �Ҹ�Ÿ���� �޼ҵ�� ���� ������ Ʈ�縦 ��ȯ�Ѵ�.
			line = scan.nextLine(); // ������ �о�� ù��°���� �̹� �о����ϱ� �� ���� �ι�° ���� �о�´�.
			String[] data = line.split(","); // ������ line�� ������ (",")�� �ɰ��ְڴ�
												// �ɰ��� ���ڿ��� String[] data�� �迭�� �ְڴ� ��� ��

			System.out.println(data[3]); // data��� �迭���� [3] 3��° ���ڿ��� �̰ڴ�.

			total += Integer.parseInt(data[3]); // total�� ������ data�� ���Ѵ� (�������� �������� ���� ����)
		}

		System.out.printf("���� : %d", total);

		fis.close();
		scan.close();
	}

}
