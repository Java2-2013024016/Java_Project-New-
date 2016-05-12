package sample_0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Shape s1 = new Shape();
		Shape r1 = new Rectangle(); // 원래는 Rectangle r1=new Rectangle();해야하는데
									// 부모가 Shape임을 이용해서 표현해봄
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();

		// s1.move(99,99);
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1); // rectangle의 iii 돌아감
		infor(c1);// 이거 안쓰면 밑에 c.info안돌아감

		r1.info();
	}

	static void infor(Shape ro) {
		ro.info();
	}// static method는 반드시 끼리끼리 불러들일 수 있어서 static 써줌

	/*
	 * static void infor(Shape c) { c.info(); }
	 */
	static void inforr(Rectangle r) {
		r.info();
	}
}
