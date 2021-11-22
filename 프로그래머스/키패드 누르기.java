//https://programmers.co.kr/learn/courses/30/lessons/67256

class Solution {
    public String solution(int[] numbers, String hand) {
       StringBuilder sb = new StringBuilder();
		int left = 10;// '*' 
		int right = 12;// '#' 

		for(int number : numbers) {
			if(number == 1 || number == 4 || number == 7) { // Left
				sb.append("L");
				left = number;
			} else if(number == 3 || number == 6 || number == 9) {	// Right
				sb.append("R");
				right = number;
			} else { // Center
				int lLength = getLength(left, number); //길이를 계산하는 메소드 실행
				int rLength = getLength(right, number);

				if(lLength > rLength) {//더 가까운 쪽을 sb에 대입
					sb.append("R");
					right = number;
				} else if(lLength < rLength) {
					sb.append("L");
					left = number;
				} else {//left = right
					if(hand.equals("right")) {//오른손잡이
						sb.append("R");
						right = number;
					} else {//왼손잡이
						sb.append("L");
						left = number;
					}
				}
			}
		}
		return sb.toString();
	}

	public static int getLength(int index, int number) {

		// 숫자 0의 경우 11로 치환
		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int X = number / 3;
		int Y = 1;

		return Math.abs(x-X) + Math.abs(y-Y);
	}
}

