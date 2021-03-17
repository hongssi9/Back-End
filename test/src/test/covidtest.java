package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest {

	public static void main(String[] args) throws IOException {
		String[][] rows;
		int count = 0;
		// ���ڵ� ������ �˾Ƴ��� �ڵ� (count)
		{
			FileInputStream text = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(text);
			String line = sc.nextLine();

			// while �ݺ��ϸ鼭 count++�������Ѵ� ->������ ���� ���� ������
			while (sc.hasNext()) {
				line = sc.nextLine();
				count++;
			}

			System.out.printf("ī���� : %d\n", count);

		}

		// count���� ���� ������ �� �������� �˾����ϱ� �װ����� �迭���ٰ� ���� �����ϴ� �ڵ�
		{
			rows = new String[count][]; //�迭�� ���� �������� ���� ���� ������� �迭�� ������ ä������
			FileInputStream text = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(text);
			String line = sc.nextLine();

			for (int i = 0; i < count; i++) {
				line = sc.nextLine();
				rows[i] = line.split(",");
			}

		}

		// �˻������ڼ� �� ��
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]); // rows[i] ó������ ������ �ٿ� ���� ���ؾ��ϴϱ� ������ �����ִ°���
			}

			System.out.printf("�˻������ڼ� �� ��: %d\n", total);

		}
		{
			// ���� ���� �˻���� �� ����.
			int max = 0;
			int index = 0;
			for (int i = 0; i < count; i++) {
				if (Integer.parseInt(rows[i][3]) > max) {
					max = Integer.parseInt(rows[i][3]);
					index = i;
				}
			}
			System.out.printf("���� ���� �˻�� : %d\n", max);
			System.out.printf("�˻���� ���� ���Ҵ� �� : %s\n", rows[index][0]);
		}
//		
//		{
//			// �Ϻ� ���� ���� �˻���� �� ����(���� ������ ���)
//			
//			int max = 0;
//			
//			String day = "";
//			
//			int box =0;
//			
//			for(int i=0;i<count;i++) {
//				box = Integer.parseInt(rows[i][3]);
//						if(max < box) {
//							max= box;
//							day = rows[i][0];
//						}
//				
//			}
//			System.out.printf("�˻���� ���� ���Ҵ� ��%s : ���� ���� �˻��%d\n",day,max);
//
//		}

		// Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
		{
			String dates = ""; // ���ڴ� ���ڿ��̴ϱ� ���ڿ��� ���� ���� ����
			int diff = 0; // �þ ���� ������ ����

			int old = 0; // ���� Ȯ���� ��

			int index = 0;

			for (int i = 0; i < count; i++) {
				int currents = Integer.parseInt(rows[i][1]);

				if (old != currents) { // Ȯ���ڼ��� �Է¹��� i���� Ȯ���ڼ��� ���� �ʴٸ�

					diff = currents - old;

					dates = rows[i][0]; // ����

					old = currents;

					System.out.printf("%d : %s, %d\n", index++ + 1, dates, diff);
				}

			}
		}

		// Ȯ���� ���� �þ ���ڿ� ���� ���� �迭�� ����ֽÿ�.
		String[][] results;
		int resultcount = 0;

		{
			int old = 0;

			for (int i = 0; i < count; i++) {
				int currents = Integer.parseInt(rows[i][1]); // i��° ���� Ȯ���ڼ�

				// i��° Ȯ����(current)�� ���� Ȯ���ڼ�(old)�� �ٸ��ٸ�
				if (old != currents) {
					old = currents;
					resultcount++;
//					diff = currents - old;

				}

			}

			System.out.println(resultcount);

			results = new String[resultcount][];
			// �̸�ǥ //����(��ü) ������ ���� �Ҵ�x
			// ���������δ� �̸��� ������ �ֱ��� �̸�ǥ�� �ּҸ� �����ؾ��ϴϱ�(4byte)
			String date = ""; // ��¥
			int diff = 0; // ������
			old = 0; // ���� ��
			int index = 0;

			for (int i = 0; i < count; i++) {
				int current = Integer.parseInt(rows[i][1]);
				if (old != current) {
					diff = current - old;
					old = current;
					date = rows[i][0];

					String[] row = new String[2];
					row[0] = date; // ��¥
					row[1] = String.valueOf(diff); // �þ �� row�� �־���ϴϱ� row�� String���� ����Ǿ����� ����ȯ����

					results[index++] = row;

//					System.out.printf("%s %d\n",date,diff);
				}

			}
			for (int i = 0; i < resultcount; i++) {
				System.out.printf("%s %s\n", results[i][0], results[i][1]);
			}

		}

	}

}