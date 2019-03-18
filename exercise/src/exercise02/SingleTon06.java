package exercise02;

//˫�ؼ�飬volatile���Է�ֹ�ӻ�����ȡֵ���Ƽ���
public class SingleTon06 {

	private static volatile SingleTon06 singleTon06;
	
	private SingleTon06() {
		
	}
	
	public static SingleTon06 getInstance() {
		if(singleTon06 == null) {
			synchronized(SingleTon06.class) {
				if(singleTon06 == null) {
					singleTon06 = new SingleTon06();
				}
			}
		}
		return singleTon06;
	}
}
