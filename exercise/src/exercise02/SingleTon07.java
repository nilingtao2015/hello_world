package exercise02;

//静态内部类，在SingleTon07在加载的时候，内部类并不进行加载，只有在调用getInstance的时候才会装配SingleTonInstance
//类的静态属性只会在第一次加载类的时候初始化，而类进行初始化时，别的线程是无法进入的
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
