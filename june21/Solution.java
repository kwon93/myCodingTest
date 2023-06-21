package june21;

public class Solution {
	public String solution(String cipher, int code) {
        String answer = "";
        int cnt = 1;
        char[] chars = cipher.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (cnt % code == 0) {
                sb.append(chars[i]);
            }
            cnt++;
        }
        answer = sb.toString();
        return answer;
    }
}
