package ex2.control;

import java.util.Scanner;

public class Program {

   public static void main(String[] args) {
	   
	 //scan �̶�� �̸����� Scanner ��ü�� �����ϰ�
//		Scanner scan = new Scanner(System.in);
//		
//		//scan�� �̿��ؼ� �������� �Է� �޾� ���� ans�� ��´�
//		int ans = scan.nextInt();
//		
//		//ans ���� 3���� ũ�� 2�� �����̸� 3�� x ������ ��Ƽ�
//		int x = (ans > 3) ? 2:3; //ans�� 3���� ũ��? �̶�� ������ �ɾ� ũ�� = �� ������ = ����
//		
//		//x ������ ���� ����Ѵ�
//		System.out.println(x);
//-----------------------------------------------------------------
	      
	   
      // �⺻���� : primitive type
      int kor, eng;
      int math;
      int total;
      float avg;

      kor = 0;
      eng = 0;
      math = 0;
      
      boolean more = true; //�Ҹ���(�ο�) �ڷ����� ���ԵǴ� ���� �� �Ǵ� ������ �����ϴ�
      
      while(more) //���ǽ�
      {
      // ���⿡ ������ �Է��ϴ� �ڵ带 �ۼ��Ͻÿ�.
      Scanner scan = new Scanner(System.in);

      System.out.println("��������������������������������������������");
      System.out.println("��      ������ �Է�      ��");
      System.out.println("��������������������������������������������");


      System.out.printf("���� : ");
      kor = Integer.parseInt(scan.nextLine());
      System.out.printf("���� : ");
      eng = Integer.parseInt(scan.nextLine());
      System.out.printf("���� : ");
      math = Integer.parseInt(scan.nextLine());

      total = kor + eng + math;
      avg = total / 3.0f;

      System.out.println("������������������������������������������������������������������");
      System.out.println("��             ���� ���           ��");
      System.out.println("������������������������������������������������������������������");

      System.out.printf("���� : %d\n", kor);
      System.out.printf("���� : %d\n", eng);
      System.out.printf("���� : %d\n", math);

      System.out.printf("���� : %2d\n", total);
      System.out.printf("��� : %26.2f\n", avg);
      
      System.out.print("����ұ��?(true/false)");
      more = scan.nextBoolean();
      }
   }

}