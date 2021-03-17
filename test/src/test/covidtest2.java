package test;

import java.awt.print.PrinterGraphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest2 {

	public static void main(String[] args) throws IOException {
		String[][] rows;
		int count = 0;
		// ���ڵ� ������ �˾Ƴ��� �ڵ� (count)
		{
			FileInputStream text = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(text);
			String line = sc.nextLine();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				count++;
			}
			System.out.println(count);

		}

		// count���� ���� ������ �� �������� �˾����ϱ� �װ����� �迭���ٰ� ���� �����ϴ� �ڵ� *
		{
			rows = new String[count][];
			FileInputStream text = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(text);
			String line = sc.nextLine();

			for (int i = 0; i < count; i++) {
				line = sc.nextLine();
				rows[i] = line.split(",");
			}

		}

		// �˻� �����ڼ� ����
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]);
			}

			System.out.println(total);

		}

		{
			// �Ϻ� ���� ���� �˻���� �� ���� *
			int max = 0;
			String day = "";
			for (int i = 0; i < count; i++) {
				int box = Integer.parseInt(rows[i][3]);
				if (max < box) {
					max = box;
					day = rows[i][0];

				}
			}
			System.out.printf("�˻��%d ����%s\n", max, day);

		}

		// Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
		{
			int box = 0;
			int sum = 0;
			int index = 0;
			String day = "";
			for (int i = 0; i < count; i++) {
				int move = Integer.parseInt(rows[i][1]);
				if (box != move) {
					sum = move - box;
					box = move;
					day = rows[i][0];
					index++;
					System.out.printf("%d����:%s �þ��:%d\n ", index, day, sum);
				}
			}

		}

		String[][] newarr;
		int count2 = 0;
		{
			// Ȯ���� ���� �þ ���ڿ� ���� ���� �迭�� ����ֽÿ�.
			int box = 0;
			int sum = 0;
			int index = 0;
			String day = "";
			for (int i = 0; i < count; i++) {
				int move = Integer.parseInt(rows[i][1]);
				if (box != move) {
					sum = move - box;
					box = move;
					day = rows[i][0];
					count2++;

				}
			}

			System.out.println(count2);
			newarr = new String[count2][];

			box = 0;
			sum = 0;
			index = 0;
			day = "";
			for (int i = 0; i < count; i++) {
				int move = Integer.parseInt(rows[i][1]);
				if (box != move) {
					sum = move - box;
					box = move;
					day = rows[i][0];
					
					String[] arr = new String[2];
					arr[0] = day;
					arr[1] = String.valueOf(sum);
					
					newarr[index++] = arr; 

				}

			}
			for(int i=0;i<count2;i++) {
				System.out.printf("����%s ����%s\n",newarr[i][0],newarr[i][1]);
			}

		}
	}
}
