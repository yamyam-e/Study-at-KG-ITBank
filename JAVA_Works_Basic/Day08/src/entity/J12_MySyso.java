package entity;

public class J12_MySyso extends Thread {
	
	@Override
	public void run() {
		
		int n = 1;
		
		while(true) {
			System.out.println(n);
			
			try {
				Thread.sleep(1000); //1000���� 1�� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			n++;			
		}
	}

}
