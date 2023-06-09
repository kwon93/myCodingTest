package june09;

public class Solution2 {
	/*
	* 스트링을 char 배열로 만든다 -> 배열의 크기를 나누기 2한다. ->
	* 나눈값을 절대값으로 변환 후 그 값을 인덱스로 사용한다.->
	*  char type 배열의 크기가 홀수라면 올림한 값의 인덱스를 리턴한다.
	* -> char type 배열의 크기가 짝수라면 해당인덱스와 -1한 인덱스 두개를 스트링으로변환한 뒤 합쳐 리턴한다.
	* */
	public String solution(String s) {
		String answer = "";
		char[] charArr = s.toCharArray();
		double idx1 = charArr.length / 2.0;
		int idx2 = (int) Math.abs(idx1);

		if (charArr.length % 2 != 0) {
			answer = String.valueOf(charArr[idx2]);
		} else {
			String a1 = Character.toString(charArr[idx2 - 1]);
			String a2 = Character.toString(charArr[idx2]);
			answer = a1 + a2;
		}
		return answer;
	}
}
