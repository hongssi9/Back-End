<<<<<<< HEAD
package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream text = new FileInputStream("res/names.txt");
		Scanner name = new Scanner(text);
		String line = name.nextLine();
		
		String[] names = line.split(",");
		
		System.out.println(names[2]);
		
		
			
	}
}

=======
package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		//1. names�ؽ�Ʈ�� �����ͼ� �迭�� �ְ� ,�� �����Ͽ� ���缮�� ����Ͻÿ�
			
		FileInputStream text = new FileInputStream("res/names.txt");
		Scanner sc = new Scanner(text);
		
		String line = sc.nextLine();
		
		String[] names = line.split(",");
		
		System.out.println(names[0]);
		
		
		
			
	}
}

>>>>>>> bfa52ebbf9b2a3592b942e8f27425557af610ea2
