package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		//1. res/img.bmp ������ �б� ���� FileInputStream ��ü fis�� �����ϰ�
		//	 res/img_copy.bmp ���Ϸ� ���� ���� FileOutputStream��ü fos�� �����Ѵ�
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
		
		//2. fis�� ���ؤ� 1����Ʈ�� �о byte ���� b�� ��´�.
		int b = 0;
		
		while((b = fis.read()) != -1) {		// ! <- ���� ������ ������ �ڵ����� ������ �Ӽ��� �ٲ� 	
			fos.write(b); 					// != ���� �ʴ�, -1�� �ɶ����� ������ ��� �д´�(���� ������ ������ read�� -1�� �о�´�-���̻� ������ ���� ������)
		
		}
		//3. 2���� �� �̻� �о���� ���� ���� ������ �ݺ��Ѵ�.
		
		//4. ��� ��Ʈ�� ��ü�� �ݴ´�.
		fis.close();
		fos.close();
		
		System.out.println("����Ϸ�");
	}

}
