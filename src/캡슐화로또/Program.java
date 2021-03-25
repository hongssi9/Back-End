package 캡슐화로또;

import java.util.Random;

public class Program {
	static void print(Lotto lotto) {
		for (int i = 0; i < Lotto.getSize(lotto); i++) {
			System.out.printf("[" + "%d" + "] ", Lotto.getNum(lotto, i));
		}

		System.out.println();
	}
	
	

	public static void main(String[] args) {
//		Lotto lotto; //Lotto클래스를 사용함

		
		//lotto 객체를 생성
		Lotto lotto = new Lotto(); //4byte
		//lotto를 생성 한 후에 반드시 초기화 해야 할 것.
		//lotto.nums = new int[6]; //24byte
		Lotto.init(lotto);
		
//		int[] lotto;
		// 로또를 만들자

		lotto = Lotto.gen(); //Lotto의 인스턴스(객체)를 만드는 함수다.
		
//		// 로또를 출력하자
		print(lotto);
		
		Lotto.sort(lotto);  //얘도 공유한다.
		
		print(lotto);
//		
//		System.out.println();
//		System.out.println("───────────after sort─────────── ");
//
//		// 로또를 정렬하자
//		Lotto.sort(lotto);
//
//		// 로또를 출력하자
//		print(lotto);
	}


}


