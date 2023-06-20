package june20;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] > 96){
                sb.append(chars[i]);
            }
        }
        sb.reverse();

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] < 97){
                sb2.append(chars[i]);
            }
        }
        sb2.reverse();
        sb.append(sb2);

        answer = sb.toString();
        return answer;
    }
}