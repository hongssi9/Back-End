package ex3.arry.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner fscan = new Scanner(fis);
		
		String line = fscan.nextLine();
		
		String[] names = line.split(",");
		
		//��ȣ��,���缮,����,����ȣ,������,������,�ڹ���
		
		System.out.println(names[1]);
		
		fscan.close();
		fis.close();
	}

}
