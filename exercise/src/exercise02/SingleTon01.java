package exercise02;

//饿汉式，使用静态常量，多线程可用
public class SingleTon01 {

	private final static SingleTon01 singleTon01 = new SingleTon01();
	
	private SingleTon01() {
		
	}
	
	public static SingleTon01 getInstance() {
		return singleTon01;
	}
	
}
