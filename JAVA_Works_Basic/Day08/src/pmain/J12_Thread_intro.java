package pmain;

import javax.swing.JOptionPane;

import entity.*;

//	Thread : ���α׷��� ���� �帧�� �����ϴ� �ڿ�
//	1. ���ÿ� �����ϰ��� �ϴ� ��� ������ŭ Ŭ���� �ۼ�
//	2. �� Ŭ������ extends Thread
//	3. run �޼ҵ带 �������̵� �� ��, ���ϴ� ��� ����
//	4. �� ��ü ���� ��, start() �޼ҵ�� ���� ��


public class J12_Thread_intro {
	
	public static void main(String[] args) {
		
		J12_MyJop mj = new J12_MyJop();
		J12_MySyso ms = new J12_MySyso();

		mj.start();
		ms.start();
	}

}
