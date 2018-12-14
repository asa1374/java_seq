package math;
import java.util.Random;
/**
 *  <문제>
1개 반의 학생의 몸무게를 측정하였다.
- 각 반의 학생의 수는 30명이다.
- 각 반의 학생 몸무게의 최대, 최소값을 구하시오.
- 단, 몸무게는 40 ~ 100 사이에서만 랜덤으로 생겅시키시오
 * */
public class MaxMin {
	public static void main(String[] args) {
		Random random = new Random();
		int[] num = new int[30];
		for(int i=0;i<num.length;i++) {
			num[i]=random.nextInt(61)+40;
		}
		int max = 40, min = 100;
		for(int i=0;i<num.length;i++) {
			if(max <= num[i]) {
				max = num[i];
			}
			if(min >= num[i]) {
				min = num[i];
			}
		}
		System.out.println("Max : "+max+"\nMin :"+min);
	}
}
