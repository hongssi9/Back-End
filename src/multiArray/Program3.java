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
		System.out.printf("텍스트 총 몇줄 : %d",count);
		System.out.println();
		System.out.println();
		// -------------------------------------------------------------
		// 검사진행자 누적수를 얻는 코드
		{
			int total = 0;

			for (int i = 0; i < count; i++) {
				total += Integer.parseInt(rows[i][3]);				
			}
			System.out.printf("검사진행자 누적수 : %d\n",total);
			System.out.println();
//-------------------------------1번문제--------------------------------
			// 1 일별 가장 많은 검사수
			
				// 1번 문제를 위한 변수
				int max = 0;
				int current;

//				// 2번 문제를 위한 변수
//				String date = "";
//				int idx = 0; // 높은수 인덱스

				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max)
						max = current;
				}
			

		System.out.printf("일별 가장 많은 검사수 : %d",max);
		System.out.println();
		System.out.println();
				// --------------------------------1번문제---------------------

		
		
				// ------------------------------2번문제------------------\
//				검사진행수가 가장 많았던 날짜는?
				{
				int index = 0;
				
				for (int i = 0; i < count; i++) {
					current = Integer.parseInt(rows[i][3]);
					if (current > max) {
						max = current;
					}
		
				}System.out.printf("일별 가장 많은 검사진행자수 : %d\n",max);
				
				for(int i=0; i<count; i++){
					if(rows[i][3].equals(String.valueOf(max)))
						index = i;
				}
				System.out.printf("날짜 : %s\n",rows[index][0]);
				}
				
				System.out.println();
				
				// ----------------------2번문제------------------------------

				// ------------3번문제--------------------------------------
				// 확진자 수가 늘어난 일자와 수를 출력하시오.
				{
					String dates="";			
					int diff = 0;
					
					int old = 0; //현재 확진자 수
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
//					System.out.printf("최대값 : %d", max);
//				}
//			}
		
	
}

