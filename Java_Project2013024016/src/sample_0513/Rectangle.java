package sample_0513;

public class Rectangle extends Shape {
	private int x1, y1;

	public Rectangle() {
		x1 = 5;
		y1 = 5;
	}// 생성자 만들기-for 초기화

	public void move(int _x, int _y) {
		x = x1 + _x;
		y = y1 + _y;
	}

	public void info() {
		System.out.println("R      X : " + x + "   y: " + y);
	}

	public void iii() {
		System.out.println(x1 + " " + y1);
	}
}
