
public class J03_This {
	
//	this: �޼ҵ� �Ǵ� �����ڰ� ���Ǵ� ��ü�� ���� ��ȣ
//	�� ��ü ���� this �� �ؽ��ڵ� ���� �ٸ���.
	
	public static void main(String[] args) {
		
		J03_People pp1 = new J03_People();
		System.out.println("pp1 : " + pp1);
		
		pp1.setData("�Ѹ�", 10);
		pp1.showData();
		
		J03_People pp2 = new J03_People();
		System.out.println("pp2 : " + pp2);
		
		pp2.setData("�����", 20);
		pp2.showData();
		
		
	}

}
