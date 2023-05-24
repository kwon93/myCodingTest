package may24;

import java.util.*;

class Solution {
 public long solution(long n) {
       String[] list = String.valueOf(n).split(""); 
       //string.valueOf로 스트링 변환 후 -> split으로 1 2 3 4 5 공백을 기준으로 잘라냄
       
       Arrays.sort(list); //sort 오름차순 메소드로 정렬 
       
       StringBuilder sb = new StringBuilder(); 
       for (String aList : list) sb.append(aList);
       //배열을 StringBuilder를 이용해 String하나로 합침.
       
       return Long.parseLong(sb.reverse().toString());
       //reverse메소드로 내림차순으로 변경 후 parseLong으로 long 타입 변환 후 return;
 }
}

