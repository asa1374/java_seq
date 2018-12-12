package geometric;
/**
 * 
 * 
 * */
public class Switch10 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<21;i++) {
			
			sum += (i%2==0) ? -i : i;
			
		}
		System.out.println(sum);
	}
}
