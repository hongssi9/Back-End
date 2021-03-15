package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class covidtest {

	public static void main(String[] args) throws IOException {
	
		FileInputStream text= new FileInputStream("res/covid.txt");
		Scanner sc = new Scanner(text);
		sc.nextLine();
		
		String[][] rows = new String[2][];
		
		
		String line;
		
		for(int i=0; i<2; i++) {
			line = sc.nextLine();
			rows[i] = line.split(",");
		}
		
		sc.close();
		text.close();
		
		for(int j=0; j<2; j++) {
		for(int i=0; i<10; i++) {
			System.out.printf(rows[j][i]);
			
		if(i<9) 
			System.out.printf(",");
			
		
			}
		System.out.println();

		}
		
		
		}
		
		
		
	}


