import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner; //��Ű���� ���ӽ����̽� 

import javax.imageio.stream.FileImageInputStream;

class Hello {
	public static void main(String[] args) throws IOException {
		int kor;
		int eng;
		int math;
		int total;
		double avg;
			

		kor = 0;
		eng = 0;
		math = 0;
		
		//--------------------------------------------
		FileInputStream fi = new FileInputStream("C:\\2021-02-19\\workspace\\Javaprj//data.txt");
		//���� �Է� ��Ʈ�� ��ü�� fi��� �̸����� ����
		//���Ϸκ��� �Է��� �޴� Ŭ���� (�޸��忡�� �о��)
		Scanner sc2 = new Scanner(fi);
		// fis�� Scanner�� �����ؼ� ���
		kor = sc2.nextInt();
		eng = sc2.nextInt();
		math = sc2.nextInt();
		fi.close(); //����� �ݾ���� �浹�� ���´�
		sc2.close();
		
		FileOutputStream fos = new FileOutputStream("C:\\2021-02-19\\workspace\\Javaprj//data.txt");
		//����� �������� Ŭ����(�Է¹��� ���� �޸������� ������)
		PrintStream fout = new PrintStream(fos);//System.out�� PrintStream�� ��ü��
		kor++;
		eng++;
		
		fout.printf("%d %d %d",kor, eng, math);
		fout.close();
		fos.close();
	
	
		//--------------------------------------------
		/*
		 * System.out.print("���� �Է� : "); String line = sc.next(); line = sc.next();
		 * System.out.printf("���� = %s\n", line);
		 * 
		 * System.out.print("���� �Է� : "); line = sc.next();
		 * System.out.printf("���� �Է� = %s\n", line);
		 * 
		 * System.out.printf("���� �Է� : "); line = sc.next();
		 * System.out.printf("���� = %s\n", line);
		 * 
		 * 
		 * System.out.println("����"); kor = sc.nextInt(); System.out.println("����"); eng =
		 * sc.nextInt(); System.out.println("����"); math = sc.nextInt();
		 * 
		 * System.out.printf("���� : %d\n",kor); System.out.printf("���� : %d\n",eng);
		 * System.out.printf("���� : %d\n",math);
		 */
		
		//----------------------------------------------------
		
				
		
		

		total = kor + eng + math;
		avg = total / 3.0;  //�ڷᰪ�� �ٸ��� �����Ҽ��� ���� �ڹٰ� ���� �������� �ٲ㼭 ����ȯ�Ͽ� �����ϱ� ������
		                  //��� : 72.000 
							//�������� ���� ����� �ϰ� avg 
		
		//avg = total / 3; ���� �ϰԵǸ� ����ȯ���� �ٲ������� ��Ȯ�� ����� �߷��� ����?
		//��� : 72.667 
		
		
		
		
		  System.out.println("����������������������������������������");
		  System.out.println("�� ���� ���           ");
		  System.out.println("����������������������������������������");
		  
		  System.out.printf("���� : %d\n",kor); System.out.printf("���� : %d\n",eng);
		  System.out.printf("���� : %d\n",math);
		  
		  
		  System.out.printf("���� : %d\n",total);
		  System.out.printf("��� : %-10.5f\n",avg);
		 
		
		
		//--------------------------------------------------------------
		/*
		 * Scanner scan = new Scanner(System.in); //Scanner �� new�� ���� �����...
		 * 
		 * 
		 * System.out.print("���� ������ �Է��Ͻÿ� : ");
		 * 
		 * String line = scan.next(); //���� ���� System.out.printf("line = %s\n", line);
		 * 
		 * line = scan.next(); //next ����(�����̽���)������ �������� ���
		 * System.out.printf("line = %s\n", line);
		 * 
		 * kor = scan.nextInt(); System.out.printf("kor =  %s\n",kor);
		 */
		//------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------
		//System.out.printf("%2$d, %2$d, %2$d, \n", 1, 30);
		
	/*
	 
	 * 
	 * int code1 = System.in.read(); System.out.printf("code is : %d \n",code1-48);
	 * System.out.printf("code is : %c \n",code1);
	 * 
	 * int code2 = System.in.read(); System.out.printf("code is : %d \n",code2-48);
	 * System.out.printf("code is : %c \n",code2);
	 * 
	 * System.out.printf("����� = %d\n", (code1-48)*10+(code2-48));
	 * 
	 */		
//------------------------------------------------------------------
		
		
		

		
		
		
		
		
	}
}