package pmain;

import entity02.J07_Cla;

public class J07_mainCla {
	
//	����������
//	- private < (default) < protected < public
//	- private
//		���� Ŭ���� ���ο����� �̿� ����
//		(�� ���� ��� ��Ȳ������ �̿� �Ұ���)
//	- (default) : �ƹ��� Ű���嵵 �Էµ��� ���� ����
//		���� ��Ű���� Ŭ�����鿡 ���ؼ��� ���� ���
//		�ٸ� ��Ű���� Ŭ�����鿡 ���ؼ� ���� �ź�
//	- protected
//		���� ��Ű���� Ŭ�����鿡 ���ؼ��� ���� ���
//		�ٸ� ��Ű���� Ŭ�����鿡 ���ؼ� ���� �ź�
//		��, �ٸ� ��Ű���� Ŭ������ �ϴ���
//			��� ���迡 �ִ� ����Ŭ������ ���ؼ��� ���� ���
//	- public
//		������ ����
	
	public static void main(String[] args) {
		
//		�ٸ� ��Ű���� Ŭ���� ��ü
		J07_Cla other = new J07_Cla();
		
//		���� ��Ű���� Ŭ���� ��ü
		J07_Cla2 same = new J07_Cla2();
		
//		1. private
//		����: System.out.println("other : " + other.priv);
//		����: System.out.println("same : " + same.priv);
		
//		2. default
//		����: System.out.println("other : " + other.def);
		System.out.println("same : " + same.def);
		
//		3. protected
//		����: System.out.println("other : " + other.prot);
		System.out.println("same : " + same.prot);
		
//		4. public
		System.out.println("other : " + other.pub);
		System.out.println("same : " + same.pub);
		
		
		
	}
}
