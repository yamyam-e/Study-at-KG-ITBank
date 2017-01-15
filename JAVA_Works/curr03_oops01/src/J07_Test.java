
public class J07_Test {
	
	public static void main(String[] args) {
	
		int count = 5;
		double[] avg = {90,70,100,75,80};//내림차순 20431 오름차순 13402
		int numTmp[] = new int[count];
		
		int tmp = 0;
		double temp = 0;
		
		for(int i = 0; i<count; i++) {
			numTmp[i] = i;
		}// 임시 인덱스 번호 생성 끝
		
		for(int each : numTmp){ 
			System.out.println(each);
		}
		System.out.println();
		
		for(int i = 0; i<count; i++) {
			for(int j = i+1; j<count; j++) {
				if(avg[i]<avg[j]) { // 평균을 기준으로 임시 인덱스 번호의 순서를 정렬
					
//					System.out.println("i :" + i + " , j :" + j);
//					temp = avg[i];
//					avg[i] = avg[j];
//					avg[j] = temp;
					
					System.out.println("i :" + i + " , j :" + j);
					tmp = numTmp[i];
					numTmp[i] = numTmp[j];
					numTmp[j] = tmp;
//					System.out.println("i :" + i + " , j :" + j);
				}
			}
		}
		
		
		for(int each : numTmp){ 
			System.out.println(each);
		}
		System.out.println();
		
		for(double each : avg){
			System.out.println(each);
		}
		
		
		
	}

}
