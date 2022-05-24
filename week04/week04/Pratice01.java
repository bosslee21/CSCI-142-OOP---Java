package week04;

public class Pratice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystery(4, 7);

		mystery(3, 3);

		mystery(10, 5);

		mystery(20, 4);

		mystery(1, 1);
	}
	public static void mystery(int x, int y) {

		if (x > y) {

		x = x - 5;

		y = y + 5;

		}

		if (x < y) {

		x++;

		y--;

		} else {

		x = y * 2;

		}

		System.out.println(x + " " + y);

		}
}
