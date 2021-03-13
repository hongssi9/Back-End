package test;

public class test {

	public static void main(String[] args) {
		 int[] arr = {9,8,7,6,15,4,17};
		  int index = 0;
		  
		  for(int i=1; i<arr.length; i++){ // 최대값을 구한다
		   if(arr[index]<arr[i]){
		    index=i;
		   }
		  }
		  
		  //교환
		  int temp = arr[0];
		  arr[0] = arr[index];
		  arr[index] = temp;
		  
		  //배열 출력
		  for(int i=0; i<arr.length; i++){
		   System.out.print(arr[i]+"\t");
		  }

	}

}
