package test;

public class test {

	public static void main(String[] args) {
		 int[] arr = {9,8,7,6,15,4,17};
		  int index = 0;
		  
		  for(int i=1; i<arr.length; i++){ // �ִ밪�� ���Ѵ�
		   if(arr[index]<arr[i]){
		    index=i;
		   }
		  }
		  
		  //��ȯ
		  int temp = arr[0];
		  arr[0] = arr[index];
		  arr[index] = temp;
		  
		  //�迭 ���
		  for(int i=0; i<arr.length; i++){
		   System.out.print(arr[i]+"\t");
		  }

	}

}
