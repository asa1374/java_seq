package math;
import java.util.Scanner;
/**
 *  합성수를 소수의 곱으로 나타내는 방법
 * 
 * */
public class Factorization {
	public static void main(String[] args) {
			int num;//수를 입력받을 변수
			int print;//출력을 위한 변수
			Scanner scan = new Scanner(System.in);
			while(true){
				System.out.print("소인수분해 할 수를 입력하세요. : ");
				num = scan.nextInt();
				print = num;//num은 변하기 때문에 출력을 위해 print에 미리 넣어둠
				break;
		}
			int array[] = new int[20];//답항을 출력할 변수
			int cnt=0;//배열 자리 지정 변수
			int div=2;//나누기에 사용할 변수
			if(num>=2){
				while(true){
					if(num%div==0){
						array[cnt]=div;
						cnt++;
						num=num/div;
						if(num==1)break;
					}else{
						div++;
					}
				}
			}
			System.out.print(print+" = ");
			for(cnt=0;cnt<array.length;cnt++){
				if(array[cnt]!=0){
					System.out.print(array[cnt]);
					if(array[cnt+1]!=0){
					System.out.print("*");
				}
			}
		}
	}
}
