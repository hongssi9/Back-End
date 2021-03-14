package ex3.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		int size = 0;
		
		byte[]buf = new byte[1000];
		
		while((size = fis.read()) != -1) {		// ! <- ���� ������ ������ �ڵ����� ������ �Ӽ��� �ٲ� 	
			
			System.out.println(size);
			fos.write(buf,0,size);
		}
			
			
//		 != ���� �ʴ�, -1�� �ɶ����� ������ ��� �д´�(���� ������ ������ read�� -1�� �о�´�-���̻� ������ ���� ������)
//		int b;
//		
//		byte[]buf = new byte[1000];
//		do {
//			b = fis.read();
//			
//			if(b != -1)
//				fos.write(b);
//		}
//		while(b != -1);
		
		
		
		
		fis.close();
		fos.close();
		
		System.out.println("����Ϸ�");
	}

}
