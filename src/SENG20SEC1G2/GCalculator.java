package SENG20SEC1G2;

public class GCalculator {
	public static String calculate(int score) {
		if(89<score && score<101) {
			return "A+";
		}
		else if(84<score && score<90) {
			return "A";
		}
		else if(79<score && score<85) {
			return "A-";
		}
		else if(74<score && score<80) {
			return "B+";
		}
		else if(69<score && score<75) {
			return "B";
		}
		else if(59<score && score<70) {
			return "B-";
		}
		else if(54<score && score<60) {
			return "C+";
		}
		else if(49<score && score<55) {
			return "C";
		}
		else if(44<score && score<50) {
			return "D";
		}
		else if(34<score && score<45) {
			return "FX";
		}
		else if(0<=score && score>35) {
			return "F";
		}
		else
		return "the score recieved is illegal";
	}

}
