package ex9.인터페이스.exam.ybm;

public class Program {

	public static void main(String[] args) {
		YBMExam exam = new YBMExam(1,1,1,1,1);
		YBMExamConsole console = new YBMExamConsole();
		console.setBanner(console);
		console.setExam(exam);
		
		console.input();
		console.print();
	}

}
