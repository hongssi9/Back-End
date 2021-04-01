package ex7.상속.IS_A;

import java.awt.Frame;

public class Program {

	public static void main(String[] args) {
			
		Exam a1 = new Exam(); //오버로드 생성자가 있으면 자동으로 생성자를 만들어주지 않음
		
		NewExam exam = new NewExam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("total : %d, avg : %f\n",total,avg);
		
//		MyFrame win = new MyFrame();
//		win.setVisible(true);
		
		
		
		
	}

}
