package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		//1. names�ؽ�Ʈ�� �����ͼ� �迭�� �ְ� ,�� �����Ͽ� ���缮�� ����Ͻÿ�
			
		FileInputStream text = new FileInputStream("res/names.txt");
		Scanner sc = new Scanner(text);
		
		String line = sc.nextLine();
		
		String[] names = line.split(",");
		
		System.out.println(names[0]);
		
		
		
			
	}
}

