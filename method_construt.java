package Assignment_3;
//create a method cal(int a, int b) overload this method to add, subtract, multiply and divide a with b.
class calc {
	void cal(int a, int b) {
		System.out.println("Addition = " + (a + b));
	}

	void cal(double a, double b) {

		System.out.println("Substraction = " + (a - b));
	}

	void cal(long a, long b) {

		System.out.println("Multiplication = " + (a * b));
	}

	void cal(float a, float b) {

		System.out.println("Division = " + (a / b));
	}

}

public class method_construt {
	public static void main(String args[]) {
		calc obj = new calc();

		obj.cal(4, 2);
		obj.cal(4.0, 3.0);
		obj.cal(78L, 739L);
		obj.cal(5.6f, 3.0f);

	}

}
