import java.util.Scanner;
//java.utill��Ű�� ���� ���������� ����Ʈ���� ���� ���

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		String str;
		
		Scanner sc = new Scanner(System.in);
		//Scanner ȭ�����κ��� �����͸� �Է¹޴� ����� �����ϴ� Ŭ����
		//��ü ����
		
		System.out.println("�Է¶�");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		str = sc.nextLine();
		//Stirng str = sc.nextLine(); ��������?
		
		// String next() ���� ��ū�� ���ڿ��� ���� 
		// int nextInt() ���� ��ū�� int Ÿ������ ����
		//String nextLine()  ' \n '�� �����ϴ� �� ������ �а� ' \n '�� ���� �������� ���� 
		
		System.out.printf("�������� : %d\n",kor); 
		System.out.printf("�������� : %d\n",eng);
		System.out.printf("�������� : %d\n",math); //ctr+art ����
		
		System.out.printf("���ڿ� ��� : %s\n",str);
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.printf("���� %d\n",total);
		System.out.printf("��� %f\n",avg);
		
		
	}

}
