package java_data_types;
abstract class marks {
	abstract double getPercentage();
}
class aa extends marks {
	double per1;
	aa(double sub1, double sub2, double sub3) {
		this.per1 = ((sub1 + sub2 + sub3) / 3);	
	}
	double getPercentage() {
		return per1;
	}
}
class bb extends marks {
	double per2;
	bb(double sub1, double sub2, double sub3, double sub4) {
		this.per2 = ((sub1 + sub2 + sub3 + sub4) / 4);
	}
	double getPercentage() {
		return per2;
	}
}
public class Day22_Marks_Task {
	public static void main(String[] args) {
		aa threeParam = new aa(100,95,100);
		double answerA = threeParam.getPercentage();
		System.out.println(answerA);
		bb fourParam = new bb(100,100,100,90);
		double answerB = fourParam.getPercentage();
		System.out.println(answerB);
	}
}
