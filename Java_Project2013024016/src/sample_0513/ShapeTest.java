package sample_0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Shape s1 = new Shape();
		Shape r1 = new Rectangle(); // ������ Rectangle r1=new Rectangle();�ؾ��ϴµ�
									// �θ� Shape���� �̿��ؼ� ǥ���غ�
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();

		// s1.move(99,99);
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1); // rectangle�� iii ���ư�
		infor(c1);// �̰� �Ⱦ��� �ؿ� c.info�ȵ��ư�

		r1.info();
	}

	static void infor(Shape ro) {
		ro.info();
	}// static method�� �ݵ�� �������� �ҷ����� �� �־ static ����

	/*
	 * static void infor(Shape c) { c.info(); }
	 */
	static void inforr(Rectangle r) {
		r.info();
	}
}
