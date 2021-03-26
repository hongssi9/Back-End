package 상속;

import 캡슐화.로또.객체지향.Lotto;
import 캡슐화.로또.객체지향.LottoConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		lotto.init();
		lotto.gen();
		LottoConsole.print(lotto);
	}

}
