package 캡슐화로또;

import java.util.Random;

//재사용
public class Lotto {
	private int[] nums; // 로또 번호를 정의함
	private int size;
	
	public static void init(Lotto lotto) { //반환 없는 함수
		lotto.size = 6;
		lotto.nums = new int[lotto.size];
	}
	
	public static int getSize(Lotto lotto) {
		return lotto.size;
	}
	
	
	//static 은 함수를 만들때
	public static int getNum(Lotto lotto, int i) {
//		return lotto.nums[i]; //로또에 nums에서 i번째
		
		int num = lotto.nums[i];
		
		return num;
	}

	static Lotto gen() {
		Lotto lotto = new Lotto(); //4byte  이 객체를 프로그램 클래스에서 공유한다
		lotto.nums = new int[6]; //24byte  

		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			lotto.nums[i] = rand.nextInt(45) + 1;

		}

		return lotto;
	}

	public static void sort(Lotto lotto) {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				int compare;
				if (lotto.nums[i] > lotto.nums[i + 1]) {
					compare = lotto.nums[i];
					lotto.nums[i] = lotto.nums[i + 1];
					lotto.nums[i + 1] = compare;
				}
			}
		}
	}


	
	
	
	
//	public int[] getNums() {
//		return nums;
//	}
//	
//	public int getNum(Lotto lotto, int i) {
//		int num = lotto.nums[i];
//		return num;
//	}

}
