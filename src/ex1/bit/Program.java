package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

//import java.io.FileInputStream;


public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				

		FileInputStream fis = new FileInputStream("res/img.bmp");
		//�̹��� ������ �б� ���� �����Է� ��Ʈ���� fis�� ����
		int b;
		//2����Ʈ
		b = fis.read();
		b = fis.read();
		
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();

	
		
		int fileSize = 0;
		fileSize = b1; // [0][0][0][b1]
		fileSize = b2; // [0][0][0][b2]
		fileSize = b3; // [0][0][0][b3]
 		fileSize = b4; // [0][0][0][b4]
 		
 		fileSize = b4<<24|b3<<16|b2<<8|b1;
		
		//10���� : 23
		//8���� : 023
		//2���� : 0b10
		//16���� : 0x00 
		
		//2���� -> 1��Ʈ
		//4���� -> 2��Ʈ
		//8���� -> 3��Ʈ
		//16���� -> 4��Ʈ
		
		
		fileSize = (b4&0x000000ff) <<8*3 |  //[b4][ ][ ][ ]
				   (b3&0x000000ff) <<8*2 |  //[ ][b3][ ][ ]
				   (b2&0x000000ff) <<8*1 |  //[ ][ ][b4][ ]
				   (b1&0x000000ff);         //[ ][ ][ ][b1]
		
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));
		
		
		
		
		System.out.printf("file size : %d\n ",fileSize);
		
		fis.close();
		
	

		
		//		int kor, eng, math;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("������ �Է��Ͻÿ�");
//		
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		math = sc.nextInt();
//		
//		System.out.printf("���� : %d ���� : %d ���� : %d ",kor, eng, math);
//		
//		FileOutputStream fos = new FileOutputStream("C:\\2021-02-19\\workspace\\Javaprj\\data.txt");
//		PrintStream ps = new PrintStream(fos);
//		
//		ps.printf("%d %d %d",kor, eng, math);
		
		
		
		
		
		
		
	}
	

}
