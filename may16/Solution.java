package may16;

class Solution {
	
    public int solution(int n) {
        int x = 0;
        int div = 0;

        for(int i = 1; i <= n; i++) {
        	div = n % i;
        	if(div == 1) {
        		x = i;
        		break;
        	}
        }
        return x;
    }
}
