
public class J13_forDual {
	public static void main(String[] args) {

		for(int i = 0; i < 4 ; i++ ) {
			System.out.println("i = " + i);
			for(int j = 0; j < 3; j++ ) {
				System.out.println("\t j = " + j);
			}
			System.out.println("-------------------");
		}
		System.out.println("===========================================\n\n\n");
		
		
		for(int i=0; i<4; i++) {
			System.out.println("i = " + i);
			for(int j=0; j<3; j++) {
				System.out.print("\t j = " + j);
			}
			System.out.println();
			System.out.println("-------------------------------------");
		}
		System.out.println("==========================================\n\n\n");
		
//		ȭ������ ù�� 1���� ���
//		�� ���Ͽ� ���� ���� ���� (��~�� => 0~6)
		
		int dayNum = 2; //ȭ������ ù���̹Ƿ�.....
		
		for(int i=1; i<13; i++){
			System.out.println(i);
			System.out.println(("��\t��\tȭ\t��\t��\t��\t��"));
			
			for(int k=0; k<dayNum; k++) {// 2�� / ���� k<2�� 2�� ȭ������ �ǹ�
				System.out.print("\t");
			}
			
			for(int j=1; j<31; j++) {
				System.out.print(j + "\t");
				if ((dayNum + j) % 7 == 0) {// dayNum + j : ���ϼ��� + ����ϳ�¥
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		
		
		
	}

}









