package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest {

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
		System.out.printf("텍스트 총 몇줄 : %d",count);
		}
		
		
		
	}


