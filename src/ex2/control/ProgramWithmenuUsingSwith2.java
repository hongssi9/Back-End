package ex2.control;

import java.util.Scanner;

public class ProgramWithmenuUsingSwith2 {

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
      
      EXIT:
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
      
      
      switch(menu) {
      
      case 1:
    	  //menu���� 1�̶��
    	  
      System.out.println("��������������������������������������������");
      System.out.println("��      ������ �Է�      ��");
      System.out.println("��������������������������������������������");

      
//      System.out.printf("���� : ");
//      kor = Integer.parseInt(scan.nextLine());
      //kor�� ���� ��ȿ���� ���� ���� �ʴٸ� �Է� ���� : 0~100 ������ ���� �Է��� �� �ֽ��ϴ�.
      
      //if(!0<=kor && kor <= 100)
      
//      if(kor < 0 || 100 < kor)  
      
      do {
    	  System.out.printf("���� : ");
    	  kor = Integer.parseInt(scan.nextLine());
    	  
    	  if(kor <0 || 100 <kor)
    		  System.out.println("�Է� ���� : 0~100 ������ ���� �Է��� �� �ֽ��ϴ�.");    
    		  
      }
      while(kor < 0 || 100 < kor);  //while���� �� ������ �Ϸ�ɶ����� ��� ������ �ݺ��Ѵ�.
      
      
      System.out.printf("���� : ");
      eng = Integer.parseInt(scan.nextLine());
      System.out.printf("���� : ");
      math = Integer.parseInt(scan.nextLine());
      break;
      
      
      case 2:
    	  //menu���� 2�̶��

      total = kor + eng + math;
      avg = total / 3.0f;

      System.out.println("������������������������������������������������������������������");
      System.out.println("��             ���� ���           ��");
      System.out.println("������������������������������������������������������������������");
      
      int i=0;
      while(i<3){ 	  
      
      System.out.printf("���� : %d\n", kor);
      System.out.printf("���� : %d\n", eng);
      System.out.printf("���� : %d\n", math);

      System.out.printf("���� : %2d\n", total);
      System.out.printf("��� : %-6.2f\n", avg);  
      
      i++;
      }
      //more = scan.nextBoolean();
      //break;
      
      case 3:
    	  //more = false;
    	  break EXIT;
      
    	  
      }
	

   }
      System.out.println("END");
   }
}