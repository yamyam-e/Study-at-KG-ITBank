package entity;

public abstract class J01_SuperCla {
	
	public abstract void overMth();
//	=> ������ �̿��� ���� �޼ҵ忡 abstract�� �����ϸ�
//		��� �����θ� ������ �� �ִ�.
//	=> Ŭ���� ���ο� abstract �޼ҵ尡 �ϳ��� �����ϴ� ��� 
//		Ŭ��������abstract Ű���尡 �ʿ��ϴ�.
//	=> �̸� "�߻�ȭ" �Ǿ��ٰ� ���Ѵ�.
//		(����� ���� �ָŸ�ȣ�� ���·� �����Ѵٴ� �ǹ�)
	
	public void mth() {
		System.out.println("�Ϲ� �޼ҵ� ��� ����");
	}
	
	String msg;

}