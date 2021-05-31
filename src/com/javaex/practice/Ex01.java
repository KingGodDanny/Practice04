package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		//int[] intArray = new int[5];
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;
		
		//for(int i=0; i<intArray.length; i++) { 
		for(int i=0; i <intArray.length; i++){
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}

/*
 위에 주석에서 for문안에 intArray.length는 방의 갯수를 얘기하는건데 intArray의 방을 잡아준 
 new int의 수는 5이면서 실제들어있는값은 0~2까지 3가지고 i의 초기값은 0인데 
 i가 4이됐을때<=intArray.length 실제들어있는 값의 4번째값은 존재하지않아서 에러가난다.
 그래서 실제 존재하는 값의 정확한 개수를 써줘야하고 <=에서 <로 바꿔줘야햔다.
 
*/
