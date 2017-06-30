package Assignment_3;

import java.util.Scanner;

//A method to insert elements into  array

class insert {
	int a[];
	int x;

	insert(int x) {
		this.x = x;
		a = new int[x];
		Scanner s = new Scanner(System.in);
		System.out.println("Insertion values");

		for (int i = 0; i < a.length; i++) {

			a[i] = s.nextInt();
		}

	}
}

public class insert_array {
	public static void main(String args[]) {
		System.out.println("Insert value to an array");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		insert in = new insert(j);

	}
}
