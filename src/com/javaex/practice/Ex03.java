package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}


/*intA의 방의 갯수는 3개고 그 안의 실제속성값은 [0]=3,[1]=6,[2]=9 인데
 * int A를 int B로 들어가라고 했으니 B는 방의 개수는 3이고 현재 [0],[1],[2]가 3,6,9지만 그아래에
 * intB의 [0]과 [2]의 값을 각각 20 , 10을 주었기때문에 현재 [0]=20 [1]=6 [2]=10 이 되고
 * intA[i]의 값을 i초기값 0부터 인트A의 방의개수만큼 반복해서 출력하라했으니
 * 20, 6 , 10이 출력된다.
 */

