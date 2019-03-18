package exercise02;

//����ʽ�����Ƕ��̲߳���ȫ
public class SingleTon05 {

	private static SingleTon05 singleTon05;
	
	private SingleTon05() {
		
	}
	
	public static SingleTon05 getInstance() {
		if(singleTon05 == null) {
			synchronized(SingleTon05.class) {
				singleTon05 = new SingleTon05();
			}
		}
		return singleTon05;
	}
}
