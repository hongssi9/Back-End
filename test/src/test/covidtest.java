package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream text = new FileInputStream("res/covid.txt");
		Scanner sc =new Scanner(text);
		String line = sc.nextLine();
		
		int total = 0;
		
		while(sc.hasNext()) {
			line = sc.nextLine();
			String[] covid = line.split(",");
			
			System.out.println(covid[3]);
			
			total += Integer.parseInt(covid[3]);
		}
		
		System.out.printf("√—«’¿∫ : %d",total);
	
		
	}
}
