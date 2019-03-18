package exercise02;

//饿汉式，静态代码块，多线程安全
public class SingleTon02 {
	private static SingleTon02 singleTon02;
	
	static {
		singleTon02 = new SingleTon02();
	}
	
	private SingleTon02() {
		
	}
	
	public static SingleTon02 getInstance() {
		return singleTon02;
	}
}
