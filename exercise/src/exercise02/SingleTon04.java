package exercise02;

//����ʽ���̰߳�ȫ������Ч��̫��
public class SingleTon04 {

	public static SingleTon04 singleTon04;
	
	private SingleTon04() {
		
	}
	
	public static synchronized SingleTon04 getInstance() {
		if(singleTon04 == null) {
			singleTon04 = new SingleTon04();
		}
		return singleTon04;
	}
}
