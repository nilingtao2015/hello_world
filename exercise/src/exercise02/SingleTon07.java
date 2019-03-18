package exercise02;

//��̬�ڲ��࣬��SingleTon07�ڼ��ص�ʱ���ڲ��ಢ�����м��أ�ֻ���ڵ���getInstance��ʱ��Ż�װ��SingleTonInstance
//��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ����������г�ʼ��ʱ������߳����޷������
public class SingleTon07 {

	private SingleTon07() {
		
	}
	
	private static class SingleTonInstance {
		private static final SingleTon07 INSTANCE = new SingleTon07();
	}
	
	public static SingleTon07 getInstance() {
		return SingleTonInstance.INSTANCE;
	}
}
