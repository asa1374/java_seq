package arithmetic;
/**
 연속하는 두 항의 차이가 모두 일정한 수열
 공차(common difference) : 공통적으로 나타나는 차이
 * 
 * */
public class Sequence03 {
	public static void main(String[] args) {
		// 2+8+14+20+26=70
		int d = 6;
		String res = "";
		int add =0;
		for(int i=0;i<5;i++) {
			if(i!=4) {
				res += (2+d*i)+"+";
			}else {
				res += (2+d*i)+"=";
			}
			add += 2+d*i;
		}
		System.out.println(res+add);
	}
}
