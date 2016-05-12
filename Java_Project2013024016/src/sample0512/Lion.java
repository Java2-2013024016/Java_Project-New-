package sample0512;

public class Lion extends Animal { // 상속
	private int legs;

	
	public Lion() {    //Source-Generate Constructor using Field
		super(100, "KING");  //super: 부모 생성자 호출-> 이것을 명시적 호출이라고 부른다
		this.legs = 4;
	}
	
	
	void roar() {
		System.out.println("roar()가 호출되었음");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
	/*
	 * Animal의 private으로 있기 때문에 이대로면 못씀! Animal 클래스에서는 쓸수 있찌만! 따라서 Animal의
	 * private를 protected로 수정
	 */


}
