package ex3.arry.test;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		// 1. ���� 10��¥�� nums �迭�� �����Ѵ�. �� 1,2,3,4,~~10
		// �迭 �ʱ�ȭ

		// int nums1[] = new int[] {1,2,3,4,5,6,7,8,9,10}; �߸��� ����
		// int[] nums2 = new int[] {1,2,3,4,5,6,7,8,9,10}; �̷��� �����Ҽ�������
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// �������� ��´�
		Random rd = new Random();

		for (int i = 0; i < 100; i++) {
			int idx1 = rd.nextInt(10); // 0~9
			int idx2 = rd.nextInt(10); // 0~9
			System.out.printf("idx1 : %d, idx2 : %d\n", idx1, idx2);

			// �� �ε��� ��ġ�� ���� �ٲ��
			// {1,2,6,4,5,3,7,8,9,10}
			int temp;
			temp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = temp;
		}

		// 13° �ٺ��� 18��°������ 100�� �ݺ��϶�

		// nums �迭�� ����Ͻÿ�. ��������� ������ ����.
//		for (int i = 0; i < 10; i++) {
//			System.out.print(nums[i]);
//			if (i < 9)
//				System.out.print(",");
//		}

		// ����
		// [2][6][1][2][5]
		int[] num = { 2, 6, 1, 2, 5 };

		// ���� ū ���� ã�� �� �ڷ� �о��
		// 1.���� nums�� 0��° ���� 1��° ������ ũ�ٸ� �� ��ġ�� ���� �ٲ۴�.
//		int temp;
//		temp = nums[0];
//		nums[0] = nums[1];
//		nums[1] = temp;
		// 2.���� nums�� 1��° ���� 2��° ������ ũ�ٸ� �� ��ġ�� ���� �ٲ۴�.
		// 3.���� nums�� 2��° ���� 3��° ������ ũ�ٸ� �� ��ġ�� ���� �ٲ۴�.
		// 4.���� nums�� 3��° ���� 4��° ������ ũ�ٸ� �� ��ġ�� ���� �ٲ۴�.

		for (int j=0; j<9-1; j++)
			for (int i = 0; i < 10-1-j; i++)
				if (nums[i] > nums[i + 1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i];
					nums[i+1] = temp;
				}

		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i]);
			if (i < 9)
				System.out.print(",");

		}
	}
}
