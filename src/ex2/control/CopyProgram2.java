package ex2.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");
		
//		int b = 0;
//		while((b = fis.read()) != -1) {		// ! <- 부정 연산자 넣으면 자동으로 연산자 속성이 바뀜 	
//			fos.write(b); 	
		// != 같지 않다, -1이 될때까지 파일을 계속 읽는다(읽을 파일이 없으면 read가 -1로 읽어온다-더이상 읽을게 없기 때문에)
		int b;
		do {
			b = fis.read();
			
			if(b != -1)
				fos.write(b);
		}
		while(b != -1);
		
		
		
		
		fis.close();
		fos.close();
		
		System.out.println("복사완료");
	}

}
