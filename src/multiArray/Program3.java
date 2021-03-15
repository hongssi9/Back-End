package multiArray;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {

		int count = 0;
		String[][] rows;
		// 레코드 개수를 알아내는 코드
		{
			FileInputStream fis = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(fis);

			// while 반복하면서 count++연산을한다 ->마지막 줄을 만날 때까지
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

		// 레코드를 로드하는 코드
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
		// 검사진행자 누적수를 얻는 코드
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]);

				System.out.println(total);
			}

		}

	}
}
