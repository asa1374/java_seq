package geometric;
/**
 * 등비수열 : 각 항이 그 앞 항과 일정한 비를 가지는 수열
 * 공비 (共比, common ratio)
 * 2 + 6 + 18 + 54 = 80  4항까지의 합이다.
 * 그렇다면 10항까지의 함 (시리즈)은 얼마인가?  59048
 * 2 +(2 * 3) + (2 * 3 * 3) + (2 * 3 * 3 * 3)
 * */
public class Sequence59048 {
	public static void main(String[] args) {
		int A = 2;  //초기항
		int R = 3;  //공비
		int S = A;  //합 series
		int N = 2;  //증가 count
		while(true) {
			N++;
			A *= R; 
			S += A;
			if(N>10) {
				break;
			}
		}
		System.out.printf("S is %d",S);
	}
}
