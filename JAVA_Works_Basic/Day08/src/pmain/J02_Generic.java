package pmain;

import java.util.ArrayList;
import entity.*;

public class J02_Generic {
	
	public static void main(String[] args) {
		
		ArrayList li = new ArrayList<>();
		
		li.add(10);
		li.add(123.456);
		li.add("������");
//		=> Object ���·� �����ϹǷ�, ��� ���� ����
		
		ArrayList<String> listc1 = new ArrayList<String>();
		listc1.add("������");
		listc1.add("�Ѹ�");
//		=> String���� ���׸� ������
		
//		���� : listc1.add(10);
		
//		���� : ArrayList<int> listc2 = new ArrayList<>();
//		=> ���׸� ������ Ŭ���� ���¸� ����
//		=> �⺻�ڷ����� ���� Ŭ���� ���¸� �����ϴ�
//			WrapperŬ������ ����ؾ� ��
//		=> WrapperŬ����
//			int(Integer) / double(Double) / float(Float)
//			long(Long) / char(Character) / boolean(Boolean)
		
		ArrayList<Integer> listc = new ArrayList<>();
		listc.add(10);
		listc.add(20);
		
		ArrayList<J02_People> listc2 = new ArrayList<>();
		J02_People peo = new J02_People("�Ѹ�", 10);
		listc2.add(peo);
		
		listc2.add(new J02_People("�����", 20));
		listc2.add(new J02_People("������", 30));
		
		for (J02_People each : listc2){
			System.out.println(each.getName() + " , " + each.getAge());
		}
		
	}

}
