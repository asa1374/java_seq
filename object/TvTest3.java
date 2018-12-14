package object;

public class TvTest3 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		for(int i=0;i<tvArr.length;i++) {
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		/*for(int i=0;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}*/
	}
}
