
public class J06_ArrayFor {
	public static void main(String[] args) {
	
		int[] i = new int[3];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		int a;
		a = 0;		
			System.out.println(i[a]);
		a = 1;
			System.out.println(i[a]);
		a = 2;
			System.out.println(i[a]);
			
		System.out.println("2. ==================================" );
		
		for(int p=0; p<=2; p++) {
			System.out.println(i[p]);
		}
		
		System.out.println("3. ==================================" );
		
//		.length : �迭�� ���� ���� ������ �ڵ����� ����
		int num = i.length;
		System.out.println("i �迭�� ���� ���� num : " + num);
		
		for(int p=0; p<i.length; p++) {
			System.out.println(i[p]);
		}
		
		System.out.println("4. ==================================" );
		
		
//		Ȯ�� for�� (for-each)
//			- ���� ���� �ʿ� ����
//			- ���� �ڷ����� ���� ó�� ���� (�迭, �÷���.....)
		
		for(int aa : i) { // for (�ϳ��� ���� ���� �̸��� ���� : ������ �������� ������)
			System.out.println(aa);
		}
	}
	
}
















