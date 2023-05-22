# 2023May22 • 정수 제곱근 판별

### **문제 설명 :**

임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.

n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

| n | return |
| --- | --- |
| 121 | 144 |
| 3 | -1 |

```java
package programers;

public class Solution {
	public double solution(long n) {

		long answer = 0;
		Double rt = Math.sqrt(n);
		
		if (rt == rt.intValue()){
			answer = (long)Math.pow(rt + 1, 2);
		} else{
			return -1}		
		return answer;
	}
}
```

### **문제 해결과정 :**

**Keyword :** *Math.sqrt() , Math.pow() , intValue()* 

*Math.sqrt() :* 제곱근을 구하는 메서드 

*Math.pow() :* 제곱연산을 수행하는 메서드

 ex) Math.pow(거듭제곱의 밑 , 거듭제곱의 지수)  

 Math.pow(5 , 2) → 25 출력  

*intValue() : Double* 클래스의 메서드로 실수를 정수로 변환 비슷한예로 longValue 등..이 있다.

처음 문제 해결시 sqrt() 메서드를 몰라서 수학적으로 접근하려다 포기하고 구글에 방법을 찾아봤다.

찾는 과정속에서 새로 알게된 메서드는 위에 적어둔 3가지

정답을 보고 풀게됬으니 내일 답지를 보지않고 다시 한번 문제를 풀 예정.
