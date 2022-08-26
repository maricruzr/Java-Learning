package java_data_types;

abstract class bank {
	abstract void getBalance();
}
class bankA extends bank{
	void getBalance() {
		System.out.println("the balancre is $100 ");
	}
}
class bankB extends bank {
	void getBalance() {
		System.out.println("the balance is $150 ");
	}
}
class bankC extends bank  {
	void getBalance() {
		System.out.println("the balance is $200 ");
	}
}

public class Day22_Bank_Task {

	public static void main(String[] args) {
		bankA a = new bankA();
		a.getBalance();
		bankB b = new bankB();
		b.getBalance();
		bankC c = new bankC();
		c.getBalance();
	}
}
