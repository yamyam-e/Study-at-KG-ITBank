
public class J04_Car {
	
	String name;
	int price;
	
//	������ �̿� ����
//	=> ��ü ���� �� ���ϴ� �ʱ�ȭ �۾��� �ڵ����� ������
//		(���Ǽ�)
	
	public J04_Car() {
		System.out.println("�⺻������ �۵�");
//		this.name = null;
//		this.price = 0;
	}
	
	public J04_Car(String name, int price) {
		System.out.println("����� ������ ������ �۵�");	
		this.name = name;
		this.price = price;
	}
	
	void setCar(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void showData() {
		System.out.println("�̸�: " + this.name + ", ���� : " + this.price);
	}
	
//	J04_Car() {
//		this.name = null;
//		this.price = 0;
//	}
}
