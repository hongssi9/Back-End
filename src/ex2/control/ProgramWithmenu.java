package ex2.control;

import java.util.Scanner;

public class ProgramWithmenu {

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
      Scanner scan = new Scanner(System.in);
      
      
      while(more)
      {
      int menu;
      System.out.println("��������������������������������������������");
      System.out.println("��      ������ �޴�      ��");
      System.out.println("��������������������������������������������");
      
      System.out.println("1. �����Է� : ");
      System.out.println("2. ������� : ");
      System.out.println("3. ���� : ");
      System.out.println(">");
      menu = Integer.parseInt(scan.nextLine()); //���� int���� �˻��Ѵ�
             //Integer.parseInt -> ���ڿ��� ���ڷ� ��ȯ��Ű�� �Լ�
      		 //nextLine -> ���͸� ġ�� ������ �� ���ڿ�
             //next -> �����̽�, ���� ������ �Է¹��� ���ڿ�
      		 //nextInt -> �����̽�, ���� ������ �Է¹��� ����
      
      
      //menu = scan.nextInt();//System.in -> [4913 ]
      //scan.nextLine() ���� �����
      //1. [13        ] ���۰� ����־�� �дµ� ���̰��� ���Ƽ� 
      
      
      
      if(menu ==1)
      {
      System.out.println("��������������������������������������������");
      System.out.println("��      ������ �Է�      ��");
      System.out.println("��������������������������������������������");


      System.out.printf("���� : ");
      kor = Integer.parseInt(scan.nextLine()); //2. ���ڰ��� �о� ������ ����
      System.out.printf("���� : ");
      eng = Integer.parseInt(scan.nextLine());
      System.out.printf("���� : ");
      math = Integer.parseInt(scan.nextLine());
      }
      
      else if(menu == 2)
      {
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
      more = scan.nextBoolean();
      }
      
      else if(menu == 3) {
    	  more = false;
      }
      
   }
   }
}