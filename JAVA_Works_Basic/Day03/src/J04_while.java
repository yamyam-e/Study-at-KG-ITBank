
public class J04_while {
	
	public static void main(String[] args) {
		
//		1. do - while(������ �ѹ��� ���� �� ������ �޴´�.)
		int n = 1;
		
		do {
			System.out.println("1 while ����");
			n++;
		} while(n <= 3);
		System.out.println("1�� while ����");
		
//		2. while���� ���� ���̺�� break
//		- break�� ����� 3���� : switch, while, for
//		- ����� �������� ���, ���� ����� ��� ������ ��
		ab : while(true) {//ab break�� ���� ���̺� ����
			int c = 1;
			
			while(true) {
				System.out.println("c = " + c);
				
				if( c== 5) {
					break ab; //�극��ũ�� ���̺��� �̿��Ͽ� ����� ������ �� �ִ�.
				}
				c++;
			}
			
		}
	}

}
