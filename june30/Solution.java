package june30;

/*
 * 	"a234"	false
 *	"1234"	true
 * 
 * */

public class Solution {
	public boolean solution(String s) {
        boolean answer = false;

        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 64 && s.charAt(i) < 123) {
                    return false;
                }else{
                    answer = true;
                }
            }
        }
        return answer;
    }
}
