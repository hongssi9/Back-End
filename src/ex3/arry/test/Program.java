package ex3.arry.test;

public class Program {

	public static void main(String[] args) {
		// 1. ���� 10��¥�� nums �迭�� �����Ѵ�.
		int[] nums = new int[10];

		// 2. nums�� ���ڸ� 2,4,5,6... ó�� ¦���� 10���� ä��� �ݺ����� �ۼ��Ѵ�.
//		for (int i = 0; i < 10; i++)
//			nums[i] = 2 * (i + 1);

		// 2. nums�� ���ڸ� 1,2,3,1,2,3,1,2,3,1 ó�� 1,2,3�� ��ȯ�Ǵ� ������ ä��� �ݺ���
		for(int i=0;i<10;i++)
			nums[i] = i%3+1;

		// 3.num�� ����ϴ� �ڵ带 �ۼ��Ѵ�
		// ����ϴ� ����� ������ ����.
		// 2,3,4,5,6,7,9,...20
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);

			if (i < 9)
				System.out.print(",");
		}
	}
}