
public class J01_mainCla {
	
	public static void main(String[] args) {

//		1. �ۼ��� Ŭ������ ��ü ���� �� �̿�
		J01_MyMath mm = new J01_MyMath();
		mm.getMax(2.12, 1);
		
//		2. �ڹٰ� �����ϴ� Math Ŭ������ ū�� ã�� �̿�
		int max = Math.max(1, 2);
		System.out.println("max = " + max);
		
//		3. MyMath�� ��ü ���� �̿�? => �̿� �Ұ���
//		����: J01_MyMath.getMax(12, -10);
		
//		4. static Ű���带 ������ �� => ��ü ���� �̿� ����
		J01_MyMath.getMax(12, -10);
		
	}

}
