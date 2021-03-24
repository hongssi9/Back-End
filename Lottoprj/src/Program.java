import ex6.capsule.Lotto;

public class Program {

	public static void main(String[] args) {

		int[] lotto = null;
		Lotto lotto = null;
		
		//1.소스코드를 재사용
		//2, 실행코드를 재사용
		lotto = Lotto.gen();
		
		print(lotto);
		
		System.out.println();
		
		Lotto.sort(lotto);
		
		print(lotto);

	}
	
	static void print(int[] lotto) {
		for (int i = 0; i < 6; i++) {
			System.out.printf("[" + "%d" + "] ", lotto[i]);
		}

	}

}
