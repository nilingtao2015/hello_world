package exercise02;

//双重检查，volatile可以防止从缓存中取值，推荐用
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
