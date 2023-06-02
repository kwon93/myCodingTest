package june02;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = ""; // *문자열로 바꿀 스트링 타입 선언
        for (int i = 0; i < phone_number.length() ; i++) {
                star += "*"; // 매개변수 문자열을 전부 "*"로 바꾼 문자열을 만들고
        }

        String subStar = star.substring(0,star.length()-4); // 매개변수 문자열 뒷자리 4개만 잘라낸 문자열을 만든다.
        String sub = phone_number.substring(phone_number.length()-4);
        //"*"로된 문자열을 뒤에서 4자리만 자른뒤에
        answer = subStar + sub; // 뒷 4자리가 살아있는 문자열과 합쳐준다.

        return answer;
    }
}
