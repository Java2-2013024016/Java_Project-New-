package sample_0513;

public class Circle extends Shape {
	private int r;// r초기화 하기위해서 아래 public~생성자!

	public Circle() {
		r = 3;
	}

	public void move(int _x, int _y) {
		x = _x + r;
		y = _y + r;
	}

	public void info() {
		System.out.println("C      X : " + x + "   y: " + y);
	}

	public void iii() {
		System.out.println("iii");
	}
}
