package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest {

	public static void main(String[] args) throws IOException {
	
		int count = 0;
		String[][] rows;
		// ���ڵ� ������ �˾Ƴ��� �ڵ�
		{
			FileInputStream fis = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(fis);

			// while �ݺ��ϸ鼭 count++�������Ѵ� ->������ ���� ���� ������
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
//				System.out.println(count);

			}

			sc.close();
			fis.close();

			count--;

		}
		System.out.printf("�ؽ�Ʈ �� ���� : %d",count);
		}
		
		
		
	}


