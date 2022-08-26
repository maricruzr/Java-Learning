package java_data_types;

public class Phone {
	int imei = 333333;
	String make;
	String model;
	String color;
	int memory;
	String camera;

	void makecalls() {
		System.out.println("IMEI: " + imei + "\nmake: " + make + "\nmodel: " + model + "\ncolor: " + color
				+ "\nmemory: " + memory + "\ncamera: " + camera);
	}

}
