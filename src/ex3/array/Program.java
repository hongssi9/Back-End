package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		//1. kors��� �̸��� ���� 6��¥�� �迭�� �������ֽÿ�.
		int[] kors = new int[6];
		
		//2. kors�� 3��° �濡 36�� ��� �ͽ��ϴ�.
		kors[2] = 36; //0���� �����ΰ� �������
		
		//Random ��ü
		for(int i=0;i<6;i++)
			kors[i]=rand.nextInt(45)+1;
		
		
		
//		for(int i=0; i<6; i++)
//			System.out.printf("%d",i);
			
		
		
		
		System.out.printf("%d\n",kors[2]);
	}

}
