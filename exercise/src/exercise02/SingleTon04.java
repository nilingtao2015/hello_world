package exercise02;

//懒汉式，线程安全，但是效率太低
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
