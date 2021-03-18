package ex4.struct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Covid19 row2 = new Covid19(); // 문자형 정수형 모두 담을수 있는 메모리가 만들어진다.
		row2.death = 30;
		row2.date = "a";
		row2.max = 0;
		row2.day = "";
		
		

		Covid19[] list = new Covid19[10];
		list[0] = new Covid19(); // 이걸 만들어야함
		list[0].date = "";
		list[0].death = 12;

		list[1] = new Covid19();
		list[1].date = "";
		list[1].death = 12;

		Covid19 row;
		row = new Covid19();
		row.date = "2020";
		row.death = 20;
		list[0] = row;

		row = new Covid19();
		row.date = "2020";
		row.death = 20;
		list[1] = row;

	}

}
