package ex3.array;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���� 10���� �����ϱ� ���� ���ڹ迭 chs�� ����ÿ�
		char[] chs = new char[10];
		
		//2. chs �迭�� ���� 'A'�� ��� ä��ÿ�
		for(int i=0;i<10;i++)
			chs[i] = (char)('A');
		
		//3.chs�迭�� ����� ������ ��� ����Ͻÿ�
		for(int i=0;i<10;i++) 		
			System.out.printf("%c ",chs[i]);
		System.out.println("");
		
			
		//J���� A���� ä��� �ڵ带 �ۼ��Ͻÿ�
		for(int i=0; i<10; i++)
			chs[i] =(char) ('J'-i);
				
		
		//�迭�� ����� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		for(int i =0; i<10; i++)
			System.out.printf("%c ",chs[i]);
		System.out.println("");
		
//	-------------------------------------------------------
		
		//A�� Z�� �ڸ��� �ٲ���
		for(int i=0; i<10; i++)
			chs[i] =(char) ('A'+i);
//		chs[0]='J';
//		chs[9]='A';
//		

		for(int i=0; i<10; i++)
		System.out.printf("%c " , chs[i]);
		System.out.println();
		
		//--------------------------------------------------
//		char temp;
//		temp = chs[0];
//		chs[0] = chs[9];
//		chs[9] = temp;
//		
//		for(int i=0; i<10; i++)
//			chs[i]=(char) (temp-i);
//		
//		
//		for(int i=0; i<10; i++)
//			System.out.printf("%c " , chs[i]);
		
		//--------------------����-----------------------------
		char temp;
		
		for(int i=0; i<5; i++) {
			temp = chs[i];
			chs[i] = chs[9-i];
			chs[9-i] = temp;
		}
		for(int i=0; i<10; i++)
			System.out.printf("%c " , chs[i]);
		//----------------------------------------------------
		
		
			
		
		
	}

}
