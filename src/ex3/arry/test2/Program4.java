package ex3.arry.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {
		
		//���� �����ϴ� ���� : ������ - Value Type �⺻����
		//������ �ϴ� ���� : �������� - Ref Type �⺻������ �ƴ� ���
		
		//�� ������ ���� ����
		//������ - ��� ������ ������ ����
		//���� ������ ���� ������ ������ ��ü�� ����Ű�� ���� ����
		
//		int x=3;
//		String s= "hello"; �������� ������ "hello"��ü�� ������ �ְ� ���� s�� ��θ� Ȱ���ϱ����� ĸ�� 
		
		
		FileInputStream fis = new FileInputStream("res/covid.txt");
		Scanner scan = new Scanner(fis);
		
		String line = scan.nextLine();
		
		int total = 0;
		
		while(scan.hasNextLine()) {
		line = scan.nextLine();
		String[] data = line.split(",");

			System.out.println(data[3]);
			
			total += Integer.parseInt(data[3]);
		}
			
			System.out.printf("����%d",total);
		
		
			fis.close();
			scan.close();
		}
		
	}


