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
//		for (int j = 0; j < count; j++) {
//			for (int i = 0; i < 10; i++) {
//			System.out.printf("%s", rows[j][i]);
//
//				if (i < count - 1)
//					System.out.printf(",");
//			}
//			System.out.println();
//
//		}
		System.out.printf("�ؽ�Ʈ �� ���� : %d",count);
		System.out.println();
		System.out.println();
		// -------------------------------------------------------------
		// �˻������� �������� ��� �ڵ�
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]);				
			}
			System.out.printf("�˻������� ������ : %d\n",total);
			System.out.println();
//-------------------------------1������--------------------------------
			// 1 �Ϻ� ���� ���� �˻��
			
				// 1�� ������ ���� ����
				int max = 0;
				int current;

//				// 2�� ������ ���� ����
//				String date = "";
//				int idx = 0; // ������ �ε���

				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max)
						max = current;
				}
			

		System.out.printf("�Ϻ� ���� ���� �˻�� : %d",max);
		System.out.println();
		System.out.println();
				// --------------------------------1������---------------------

		
		
				// ------------------------------2������------------------\
//				�˻�������� ���� ���Ҵ� ��¥��?
				{
				int index = 0;
				
				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max) {
						max = current;
					}
		
				}System.out.printf("�Ϻ� ���� ���� �˻������ڼ� : %d\n",max);
				
				for(int i=0; i<count; i++){
					if(rows[i][3].equals(String.valueOf(max)))
						index = i;
				}
				System.out.printf("��¥ : %s\n",rows[index][0]);
				}
				
				System.out.println();
				
				// ----------------------2������------------------------------

				// ------------3������--------------------------------------
				// Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
				{
					String dates="";			
					int diff = 0;
					
					int old = 0; //���� Ȯ���� ��
					int index= 0;
					
					for(int i=0; i<count; i++) {
						int currents = Integer.parseInt(rows[i][1]);
					
						if(old != currents) {
							
							diff = currents -old;
							dates= rows[i][0];
							
							old = currents;
							System.out.printf("%d : %s, %d\n",index+++1,dates,diff);
						}

					
						}
					}
				}
			}

//			{
//				int max = 0;
//				max = Integer.parseInt(rows[1][3]);
//				for (int i = 0; i < count; i++) {
//					if (max < Integer.parseInt(rows[i + 1][3]))
//						max = Integer.parseInt(rows[i + 1][3]);
//
//					System.out.printf("�ִ밪 : %d", max);
//				}
//			}
		
	
}

