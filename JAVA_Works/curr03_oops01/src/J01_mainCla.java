
public class J01_mainCla {
	public static void main(String[] args) {
		
//		1. ���赵(Ŭ����) �ۼ�
		
//		2. ��(�ν��Ͻ�, ��ü) ����
		new J01_People();
		
//		3. ������(���۷��� ����) ���� : ���� ���¸� ����ϴ�.
		J01_People pp1 = null; //J01_People �� ���� ���¸� ���Ѵ�.
		
		pp1 = new J01_People();
		System.out.println("pp1 : " + pp1);
		
//		4. �ν��Ͻ� ���� �� ���۷��� ������ ���ÿ� �ϴ� ���
		
		J01_People pp2 = new J01_People();
		System.out.println("pp2 : " + pp2);
		
//		5. ��ü ȣ��(���� �� �̿�)
		
		pp1.name = "�Ѹ�";
		pp1.age = 10;
		
		pp2.name = "�����";
		pp2.age = 20;
		
		System.out.println("pp1 : " + pp1.name + ", " + pp1.age);
		System.out.println("pp1 : " + pp2.name + ", " + pp2.age);
		
//		����
		
//		1. �ܹ��� ���� ���� ���α׷�
//			- �̸�, �Ǹź귣��, �����, ����, Į�θ�
//			- �ܹ��� ���� 3���� ���� �� ���
		J01_Hamberger hh1 = new J01_Hamberger();
		hh1.name = "�������";
		hh1.brand = "�Ե�����";
		hh1.ingre = "����";
		hh1.price = 3500;
		hh1.calori = 200;
		
		J01_Hamberger hh2 = new J01_Hamberger();
		hh2.name = "�Ұ�����";
		hh2.brand = "�Ƶ�����";
		hh2.ingre = "����";
		hh2.price = 5500;
		hh2.calori = 400;
		
		J01_Hamberger hh3 = new J01_Hamberger();
		hh3.name = "ġŲ����";
		hh3.brand = "KFC";
		hh3.ingre = "ġŲ";
		hh3.price = 4500;
		hh3.calori = 250;
		
		System.out.println("�ܹ����̸�\t�귣��\t\t�����\t����\tĮ�θ�");
		System.out.println("1. " + hh1.name + "\t" + hh1.brand + "\t" + hh1.ingre  + "\t" + hh1.price + "\t" + hh1.calori);
		System.out.println("2. " + hh2.name + "\t" + hh2.brand + "\t" + hh2.ingre  + "\t" + hh2.price + "\t" + hh2.calori);
		System.out.println("3. " + hh3.name + "\t" + hh3.brand + "\t\t" + hh3.ingre  + "\t" + hh3.price + "\t" + hh3.calori);
		System.out.println();
		
//		2. ���� ĳ���� ���� ���� ���α׷�
//			- �̸�, �����̸�, ���ݷ�, ����
//			- ĳ���� ���� 2���� ���� �� ���
		J01_GameCharactor gg1 = new J01_GameCharactor();
		gg1.name = "�˻�";
		gg1.gameName ="��׳���ũ";
		gg1.attack = 100;
		gg1.defence = 150;
		
		J01_GameCharactor gg2 = new J01_GameCharactor();
		gg2.name = "������";
		gg2.gameName = "��ƺ��";
		gg2.attack = 200;
		gg2.defence = 90;
		
		System.out.println("�̸�\t�����̸�\t���ݷ�\t����");
		System.out.println(gg1.name + "\t" + gg1.gameName + "\t" + gg1.attack + "\t" + gg1.defence);
		System.out.println(gg2.name + "\t" + gg2.gameName + "\t" + gg2.attack + "\t" + gg2.defence);
		
	}

}
