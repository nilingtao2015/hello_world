package exercise02;

//����ʽ��ʹ�þ�̬���������߳̿���
public class SingleTon01 {

	private final static SingleTon01 singleTon01 = new SingleTon01();
	
	private SingleTon01() {
		
	}
	
	public static SingleTon01 getInstance() {
		return singleTon01;
	}
	
}
