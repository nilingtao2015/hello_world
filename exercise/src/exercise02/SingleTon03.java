package exercise02;

//����ʽ���̲߳���ȫ
public class SingleTon03 {

	private static SingleTon03 singleTon03;
	
	private SingleTon03() {
		
	}
	
	public static SingleTon03 getInstance() {
		if(singleTon03 == null) {
			singleTon03 = new SingleTon03();
		}
		return singleTon03;
	}
}
