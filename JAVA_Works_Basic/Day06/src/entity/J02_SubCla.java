package entity;

public class J02_SubCla extends J02_SuperCla {
	
	public J02_SubCla() {
		super(); //��� ����� ����Ŭ������ ������ ȣ��
		System.out.println("����Ŭ���� ������ �����");
		System.out.println("this : " + this);
		
//		����super();
//		=> ����Ŭ������ ��� ����� �ֿ켱 �������� ���� �Ǿ�� ��
	}

	public String subMsg = "����Ŭ���� �޽���";
	
	public void subMth() {
		System.out.println("����Ŭ���� �޼ҵ�");
	}
	
}
