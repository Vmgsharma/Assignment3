package Assignment_3;

//2.	Create 2 constructors parameterized and non-parameterized that prints a line.
class construct {

	construct(int a) {
		System.out.println("parameterized constructor\n" + a);
	}

	construct() {
		System.out.println("non-parameterized constructor");
	}

}

public class constructors {
	public static void main(String args[]) {

		construct obj2 = new construct(3);
		construct obj1 = new construct();
	}

}
