package java_data_types;

public class Day18_MethodOverrideChild extends Day18_MethodOverrideParent {

	public static void main(String[] args) {
		Day18_MethodOverrideChild a = new Day18_MethodOverrideChild();
		a.openbrowser();
		a.closebrowser();
	}

	public void openbrowser() {
		System.out.println("open firefox browser");
		System.out.println("visit the website");
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click the login button");
	}

}
