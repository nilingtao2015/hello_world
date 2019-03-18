package exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

public class Test01 {

	public static void main(String[] args) {
		FutureTask<String> ft = new FutureTask<String>(() ->  {
			System.out.println("11");
			return "1";
		});
	}

}
