package array;

import java.util.Scanner;

public class Myclass {
	public static void main(String[] args) {
		String[] res = new String[4];
		String[] vivace = {"은지","지우","창준","서우","현일"};
		String[] royal = {"창하","수호","정욱","은영",""};
		String[] atlas = {"동준","종협","이레","지은",""};
		String[] nm = {"정우","태혁","승아","기호",""};
		
		System.out.println("팀장만 출력");
		String[][] class1 = {vivace,royal,atlas,nm};
		for(int i=0;i<1;i++) {
			for(int j=0;j<4;j++) {
				res[j] = class1[j][i];
			}
		}
		/*for(int i=0;i<4;i++) {
			switch(i) {
			case 0 : res[i] = vivace[0]; break;
			case 1 : res[i] = royal[0]; break;
			case 2 : res[i] = atlas[0]; break;
			case 3 : res[i] = nm[0]; break;
			}
		}*/
		for(int i=0;i<res.length;i++) {
			System.out.printf("%s \t",res[i]);
		}
	}
}
