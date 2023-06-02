# 2023June02 • 핸드폰 번호 가리기

### **문제 설명**

프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.

전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 `*`으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

### 제한 조건

- phone_number는 길이 4 이상, 20이하인 문자열입니다.

### 입출력 예

| phone_number | return |
| --- | --- |
| "01033334444" | "*******4444" |
| "027778888" | "*****8888” |

```java
class Solution {
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
```

### **문제 해결 과정:**

keyword: substring(),replace()

substring(시작 인덱스,끝 인덱스); , replace(원본 문자열,바꿀 문자열);

저번주에 String Class에 대해 공부하면서 배운 메서드를 활용해 문제를 풀어서 쉽게 풀 수 있었다.

내가 짠 코드는 좀 길게 나왔지만 다른 사람이 풀이한 코드 중 잘 짰다싶은 코드가 있어 첨부,

```java
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }

//남이 짠 코드.

```

toCharArray라는 메서드를 활용한건데 String 문자열을 char type으로 잘라 배열화 시켜준뒤 for문으로 간단하게 문제 풀이를 한 코드를 보고 다음에 비슷한 문제를 풀 경우 이 방식으로 해야겠다고 생각했다…
