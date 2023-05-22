package may22;

public class Solution {
	public double solution(long n) {
		
		long answer = 0;
		Double rt = Math.sqrt(n);
		
		if(rt == rt.intValue()) {
			answer = (long)Math.pow(rt + 1, 2);
		}else {
			return -1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		double a = s.solution(25);
		System.out.println(a);
	}
}
