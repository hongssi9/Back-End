package ex9.인터페이스.exam.ybm;

import java.util.Scanner;

import ex9.인터페이스.exam.Banner;
import ex9.인터페이스.exam.ExamConsole;

public class YBMExamConsole extends ExamConsole implements Banner{

	@Override
	protected void onPrint() {
		YBMExam exam = (YBMExam)getExam();
		System.out.printf("aa:%d\n",exam.getAa());
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scan = new Scanner(System.in);

		int toeic;
		int aa;
		
		System.out.print("toeic:");
		toeic = Integer.parseInt(scan.nextLine());
		System.out.print("aa:");
		aa = Integer.parseInt(scan.nextLine());
		
		YBMExam exam = (YBMExam)getExam();
		exam.setToeic(toeic);
		exam.setAa(aa);
		
	}
	
}
