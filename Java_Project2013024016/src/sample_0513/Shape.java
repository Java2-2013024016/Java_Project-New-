package sample_0513;

abstract public class Shape { // abstract
	protected int x, y;// private에서 protected로 바꾸면 Circle에서 사용가능

	public Shape() {
		x = 0;
		y = 0;
	}

	// 생성자를 한번이라도 오버로딩할 땐 인자가 아무것도 없는 것 넣어 줘야 함
	public Shape(int _x, int _y) { // C++에서 구분하는 방법 underbar
		x = _x;
		this.y = _y;
	}

	abstract public void move(int _x, int _y);

	/*
	 * {//Shape객체를 안쓸때 move를 쓸필요가 있나 //연관성 유지 !!!! 아래 기능 필요 없음! /*this.x += _x;
	 * y += _y; }
	 */
	abstract public void info();

	abstract public void iii();

}
