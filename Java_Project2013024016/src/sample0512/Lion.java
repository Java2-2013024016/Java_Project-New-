package sample0512;

public class Lion extends Animal { // ���
	private int legs;

	
	public Lion() {    //Source-Generate Constructor using Field
		super(100, "KING");  //super: �θ� ������ ȣ��-> �̰��� ����� ȣ���̶�� �θ���
		this.legs = 4;
	}
	
	
	void roar() {
		System.out.println("roar()�� ȣ��Ǿ���");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
	/*
	 * Animal�� private���� �ֱ� ������ �̴�θ� ����! Animal Ŭ���������� ���� ���! ���� Animal��
	 * private�� protected�� ����
	 */


}
