package sample_0513;

abstract public class Shape { // abstract
	protected int x, y;// private���� protected�� �ٲٸ� Circle���� ��밡��

	public Shape() {
		x = 0;
		y = 0;
	}

	// �����ڸ� �ѹ��̶� �����ε��� �� ���ڰ� �ƹ��͵� ���� �� �־� ��� ��
	public Shape(int _x, int _y) { // C++���� �����ϴ� ��� underbar
		x = _x;
		this.y = _y;
	}

	abstract public void move(int _x, int _y);

	/*
	 * {//Shape��ü�� �Ⱦ��� move�� ���ʿ䰡 �ֳ� //������ ���� !!!! �Ʒ� ��� �ʿ� ����! /*this.x += _x;
	 * y += _y; }
	 */
	abstract public void info();

	abstract public void iii();

}
