package ex3.arry.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1.���ڿ� 10�� ¥�� names �迭�� �����Ѵ�.
		String[] names = new String[10];

		// 2. ���Ͽ��� �̸����� �о�ͼ� names �迭�� �����Ѵ�.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);

		int index = 0;
		while (fscan.hasNextLine()) {
			String name = fscan.nextLine();
			names[index++] = name;
		}

		fscan.close();
		fis.close();

//		for (int i = 0; i < 7; i++) {
//			System.out.printf("%s", names[i]);
//
//			if (i < 6)
//				System.out.print(",");
//			
//			
//			
//
//			for(int j=0; j<i; j++) {
//				System.out.printf("%s",names[j]);
//				
//				if(j<i-1)
//					System.out.print(",");
//			}

//		}

		// 3. names �迭�� �̸��� ����ó�� �ֿܼ� ����Ѵ�.

	}

}
