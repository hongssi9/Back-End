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
		
		float fnum = 10.10;
		double dnum = 10.10;
				
		String snum;

		s_num = String.valueOf(f_num); //Float -> String 1�����
		s_num = Float.toString(f_num); //Float -> String 2�����
				
		s_num = String.valueOf(d_num); //Double -> String 1�����
		s_num = Double.toString(d_num); //Double -> String 2�����
	}

}
