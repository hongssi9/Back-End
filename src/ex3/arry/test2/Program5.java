package ex3.arry.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) throws IOException {
		
			
		
			String[] row1 = new String[10]; //10�� �迭 ����
			String[] row2 = new String[10];
			
			FileInputStream fis = new FileInputStream("res/covid.txt");
			Scanner sc = new Scanner(fis);
			
			String line; //���ڿ� line ���� ����
			
			sc.nextLine(); //�Է¹޾ƿ� sc���� ������ �о��
						
			line = sc.nextLine(); //���ڿ� ���� line�� �Ǵٽ� �ѹ� ������ �о�´� (ù°���� ����)
			row1=line.split(","); //�迭 row1�� split","���� ������ 
			
			line = sc.nextLine();
			row2=line.split(",");
			
			sc.close();
			fis.close();
			
			for(int i=0; i<10; i++) {
				System.out.printf("%s",row1[i]);
				
				if(i<9)
					System.out.printf(",");
			}
			
			System.out.println();
			
			for(int i=0; i<10; i++) {
				System.out.printf("%s",row2[i]);
				
				if(i<9)
					System.out.printf(",");
			}
			
			
			
			
	}

}
