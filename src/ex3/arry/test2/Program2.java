package ex3.arry.test2;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
	
		String[] names = {"��ȣ��","���缮","����","����ȣ","������","������","�ڹ���"};
		
		
//		String n1 = "ȫ�浿";
//		String n2 = "ȫ�浿";
//		String n3 = new String("ȫ�浿");
//		String n4 = new String("ȫ�浿");
//		
//		System.out.println(n1 == n2); 
//		System.out.println(n1.equals(n2));
//		System.out.println(n3 == n4); //���ڿ��� �ƴ� ��ü�� ���Ѵ�.
//		System.out.println(n3.equals(n4)); //equals��ü���� ������ ���� �� �ְ����ش�.
//		
//		String fileName = "photo.jpg";
//		System.out.println(fileName.length()); //���ڿ� ���̸� ������
//		System.out.println(fileName.indexOf(".")); // "." ���������� ����� ��������
//		System.out.println(fileName.substring(3)); //3��° �����ϰ� ������
//		System.out.println(fileName.substring(3,5)); //3��° �����ϰ� 5��° ���� ������
//		
//		int pos = fileName.indexOf("."); //indexOf()�� Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� ���ڿ������� ã�´�.
//		System.out.println(fileName.substring(0,pos)); //���ܾ��� ó������ pos-> .�� ������ ������ ���
//		
//		System.out.println(fileName.compareTo("ohoto.jpg") > 0);
		//photo.jpg���� fuleName�� �ϳ� �� ũ�� fileNameũ�� + photo�� �� ũ�� -
		//���ڿ��� ��ü�� �ƴ� ù���� ũ�⸸ ���Ѵ�.
		
		//--------���ڿ��� �������� ����-----------------------------------------------
		Random rd = new Random();

		for (int i = 0; i < 100; i++) {
			int idx1 = rd.nextInt(7);
			int idx2 = rd.nextInt(7);
			//System.out.printf("idx1 : %d, idx2 : %d\n", idx1, idx2);

			
			String temp;
			temp = names[idx1];
			names[idx1] = names[idx2];
			names[idx2] = temp;
		}
		
		for(int i=0; i<7; i++) {
			System.out.printf("\"%s\"",names[i]);
			
			if(i<6)   //(i<7-1)
				System.out.print(",");
			
		}
		System.out.println();
		
		
		
		//-----------------------ū ������ ����----------------------------
		for(int j=0; j<6-1; j++)
			for(int i=0;i<7-1-j; i++)
				if(names[i].compareTo(names[i+1]) > 0) {
				String temp;
				temp = names[i];
				names[i] = names[i+1];
				names[i+1] = temp;
			}
		
		for(int i=0; i<7; i++) {
			System.out.printf("\"%s\"",names[i]);
			

			if(i<7)   //(i<7-1)
				System.out.print(",");
		}
		System.out.println();
	}

}
