package multiArray;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

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
		// --------------------------------------------------------------

		// ���ڵ带 �ε��ϴ� �ڵ�
		{
			rows = new String[count][];
			FileInputStream fis = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(fis);

			String line;

			sc.nextLine();

			for (int i = 0; i < count; i++) {
				line = sc.nextLine();
				rows[i] = line.split(",");
			}

			sc.close();
			fis.close();
			// --------------------------------------------------------
		}
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%s", rows[j][i]);

				if (i < count - 1)
					System.out.printf(",");
			}

			System.out.println();

		}
		// -------------------------------------------------------------
		// �˻������� �������� ��� �ڵ�
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]);

				System.out.println(total);
			}

		}

	}
}
