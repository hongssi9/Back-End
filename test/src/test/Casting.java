package test;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s_num = "10";
		int i_num = Integer.parseInt(s_num); //String -> Int 1�����
		int i_num2 = Integer.valueOf(s_num); //String -> Int 2�����
		
		String snum = "10";
		double d_num = Double.valueOf(s_num); //String -> Double
		float f_num = Float.valueOf(s_num); //String -> Float
		
		int inum = 10;
		String snum2;
				
		s_num = String.valueOf(i_num); //���� -> ���� 1�����
		s_num = Integer.toString(i_num); //���� -> ���� 2�����
		s_num = ""+i_num; //���� -> ���� 3�����
		
//		
		int i_numm;
		i_numm = (int)d_num;
		i_num = (int)f_num;
		
	}

}
