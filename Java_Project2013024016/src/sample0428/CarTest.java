package sample0428;

public class CarTest {

	static int numbers=0;
	
	public static int getNumbers(){
		return numbers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600","white",80);   //������ ȣ��
		Car c2 = new Car("E500","blue",20);    //������ ȣ��
		int n = Car.numbers;    //���� ����
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}
//main�� ���� �޼ҵ��̱� ������ main �ȿ��� public static int getNumbers�� ������ ������ �ʴ´�
}
/*static int menu1=7;
 * public static void main(String[] args){
  ++menu1;
  �̷��� �ؾߵ�!!menu1�� �ۿ��� �׳� int menu1���� �ϸ� �ʵ忡 �ۼ��ѰŶ�!static �� �ٿ� �����
  static method �ȿ� ������ �� ������*/

/*println�� ���� �޼ҵ���*/