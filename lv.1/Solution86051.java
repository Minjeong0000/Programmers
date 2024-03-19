package lv_1;

class Solution86051 {
    public int solution(int[] numbers) {
    	int sum= 0;
    	int total =0;
    	for(int num : numbers) {
    		sum += num;
    	}
    	for(int i =0; i<10; i++) {
    		total+=i;
    	}
    	int answer = total -sum;
    	return answer;
    	
    }
}