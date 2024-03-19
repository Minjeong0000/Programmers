package lv_1;

public class Solution87389 {
	public int solution(int n) {
		int x = 1;
		while (n % x != 1) {

			x++;
		}
		return x;
	}
}
